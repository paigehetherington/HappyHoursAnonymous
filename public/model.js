var Backbone = require('backbone');

////// Happy Hour Model ///////

module.exports = Backbone.Model.extend({
  urlRoot: '/happy_hour',
  initialize: function () {
    console.log("HH MODEL FIRED");
  }
})
