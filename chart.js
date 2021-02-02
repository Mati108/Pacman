var data = [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]

var dataMax = Math.max.apply(null, data)
var dataMin = Math.min.apply(null, data)
var range = dataMax - dataMin
var areaMax = 20
var areaMin = 2

var mappedData = data.map(v => {
  var relSize = ((v - dataMin) / range)
  var radius = Math.floor(areaMin + relSize * (areaMax - areaMin))

  return {
    y: v,
    marker: {
      radius: (radius)
    }
  }
})

Highcharts.chart('container', {
  chart: {
    type: 'scatter'
  },
  xAxis: {
    categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
  },

  plotOptions: {
    series: {
      marker: {
        radius: 8
      }
    }
  },

  series: [{
    data: mappedData
  }]
});
