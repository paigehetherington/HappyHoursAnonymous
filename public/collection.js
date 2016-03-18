var Backbone = require('backbone');
var Model = require('./model');

////// Happy Hour Collections ///////

module.exports = Backbone.Collection.extend({
  url: '/happy_hour',
  initialize: function () {
    console.log("HH COLLECTION FIRED");
  }
})
