import { SET_CURRENT_USER } from "../actions/types";

const initialState = {
  validToken: false,
  user: {}
};

const booleanActionPayload = payload => !!payload;

export default function(state = initialState, action) {
  switch (action.type) {
    case SET_CURRENT_USER:
      return {
        ...state,
        validToken: booleanActionPayload(action.payload),
        user: action.payload
      };

    default:
      return state;
  }
}