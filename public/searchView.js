var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var tmpl = require('./templates');
var Model = require('./model')

////// Search View ///////

module.exports = Backbone.View.extend ({

  template: _.template(tmpl.citySearch),
  events: {
    'click div': 'citySearch'
  },
  citySearch: function (event) {
    $('div').removeClass('clicked');
    $(event.target).addClass('clicked');
    event.preventDefault();
    var city = $(event.target).data("city");
    if (city === "all") {
      console.log("ALL FIRED");
      this.collection.allUrl();
      this.collection.fetch();
    } else {
    this.collection.updateUrl(city);
    this.collection.fetch();
    }
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
