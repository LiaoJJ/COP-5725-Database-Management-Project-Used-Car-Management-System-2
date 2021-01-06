var chartDataStr = decodeHtml(chartData);
var chartJson = JSON.parse(chartDataStr);
var labelData = [];
var numericData=[];
var datasets = [];
var backgroundColor = [
    'rgba(255, 99, 132, 0.2)',
    'rgba(54, 162, 235, 0.2)',
    'rgba(255, 206, 86, 0.2)',
    'rgba(75, 192, 192, 0.2)',
    'rgba(153, 102, 255, 0.2)',
    'rgba(255, 159, 64, 0.2)'
]
 var borderColor = [
     'rgba(255, 99, 132, 1)',
     'rgba(54, 162, 235, 1)',
     'rgba(255, 206, 86, 1)',
     'rgba(75, 192, 192, 1)',
     'rgba(153, 102, 255, 1)',
     'rgba(255, 159, 64, 1)'
 ]

// plan 1: label = []



// plan 2: label = ""
// if (!ChartFill) ChartFill = false;
// if(!ChartBorderDash) ChartBorderDash = false;
for(var i=0; i<2; i++){
    datasets[i] = {
        data: [],
        label: "",
        backgroundColor: backgroundColor[i],
        borderColor: borderColor[i],
        borderDash: ChartBorderDash,
        fill: ChartFill,
        showLine: ChartShowLine,
    }
}
for(var i=0; i<chartJson.length; i++){
    labelData[i] = chartJson[i].year;
    datasets[0]["data"].push(chartJson[i]["data1"]);
    if(chartJson[i]["label1"]) datasets[0]["label"] = chartJson[i]["label1"];
    datasets[1]["data"].push(chartJson[i]["data2"]);
    if(chartJson[i]["label2"]) datasets[1]["label"] = chartJson[i]["label2"];
}

var ctx = document.getElementById('myChart1').getContext('2d');
var chart = new Chart(ctx, {
    type: ChartType,
    data: {
        labels: labelData,
        datasets: datasets,
    },
    options: {
        responsive: true,
        title:{
            display:true,
            text:ChartName
        },
        elements: {
            point:{
                pointStyle: ChartPointStyle
            }
        }
    }
});


function decodeHtml(html){
    var txt = document.createElement("textarea");
    txt.innerHTML = html;
    return txt.value;
}
