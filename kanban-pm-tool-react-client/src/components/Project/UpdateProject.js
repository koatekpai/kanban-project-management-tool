import React, { Component } from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { getProject, createProject } from "../../actions/projectActions";
import classnames from "classnames";

class updateProject extends Component {
    constructor(){ 
        super();
        this.state = {
            id: "",
            projectName: "",
            projectIdentifier: "",
            description: "",
            start_date: "",
            end_date: "",
            errors: {}
        };

        this.onChange = this.onChange.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
    }

    componentDidUpdate(prevProps) {
        if (prevProps.errors !== this.props.errors) {
            this.setState({ errors: this.props.errors });
        }
        const {
            id, projectName, projectIdentifier, description,
            start_date, end_date
        } = nextProps.project;
        this.setState(
            id, projectName, projectIdentifier, description,
            start_date, end_date
        );
    }
    componentDidMount(){
        const {id } = this.props.match.params;
        this.props.getProject(id, this.props.history);
    }

    onChange(e) {
        this.setState({ [e.target.name]: e.target.value });
    }

    onSubmit(e) {
        e.preventDefault();
        const updateProject = {
            id: this.state.id,
            projectName: this.state.projectName,
            projectIdentifier: this.state.projectIdentifier,
            description: this.state.description,
            start_date: this.state.start_date,
            end_date: this.state.end_date
        };
        this.props.updateProject(updateProject, this.props.history);
    }

    render() {
        const {errors} = this.state;
        return (
            <div>
                <div className="project">
                    <div className="container">
                        <div></div>
                    </div>
                </div>
            </div>
        );
    }
}


export default (updateProject);