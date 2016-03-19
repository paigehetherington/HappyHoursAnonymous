var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var tmpl = require('./templates');
var Model = require('./model')

////// Search View ///////

module.exports = Backbone.View.extend ({

  template: _.template(tmpl.citySearch),
  events: {
    'click h3': 'citySearch'
  },
  citySearch: function (event) {
    event.preventDefault();
    console.log($(event.target).data("city"));
    var that = this
    console.log(this);
    var city = $(event.target).data("city");
    console.log("THIS IS THE CITY", city);
    filtered = this.collection.models.filter(function (el) {
          console.log(el);
          console.log(el.attributes.city);
          return el.attributes.city === city;
    });
    console.log("FILTERED VARIABLE", filtered);
  },
  initialize: function () {
    this.listenTo(this.collection, 'update', this.addAll);
    this.$el.append(this.render());
  },
  render: function () {
    var markup = this.template;
    this.$el.html(markup);
    return this;
  }
})
