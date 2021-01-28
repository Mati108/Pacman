function customAccessor(data) {
  const newData = [];

  data.forEach(function(point, index) {
    newData.push([point.date, point.value]);
  });

  return newData;
}

Highcharts.chart('container', {
  plotOptions: {
    series: {
      keys: ['x', 'y']
    }
  },
  series: [{
    data: customAccessor(data)
  }]
});
