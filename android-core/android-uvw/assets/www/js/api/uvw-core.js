function display_gameTime(div_week,div_timer){
 var weeks = ["SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"];
 var fromDateTime = "1991-10-15 10:30:00";
     fromDateTime = fromDateTime.replace(/:/g,"|").replace(/ /g,"|").replace(/-/g,"|").split("|");
 var fromDateTimeObject = new Date(fromDateTime[0],fromDateTime[1],fromDateTime[2],
							       fromDateTime[3],fromDateTime[4],fromDateTime[5]);
 var fromDateTimeMS = Date.parse(fromDateTimeObject);
 
 var toDateTimeObject = new Date();
 var toDateTimeMS = Date.parse(toDateTimeObject);
 
 var diffMs = (toDateTimeMS-fromDateTimeMS)*10; // 
 var diffSec = Math.floor(diffMs/1000);
 var diffMin = Math.floor(diffSec/60);
     diffSec = diffSec % 60;
 var diffHr = Math.floor(diffMin/60);
     diffMin = diffMin % 60;
 var week = Math.floor(diffHr/24);
     diffHr = diffHr % 24;
     week = week % 7;

 setInterval(function(){
  if(diffSec<59){diffSec++;}
  else { diffSec=0;
	if(diffMin<59){ diffMin++; }
	else { diffMin=0;
	  if(diffHr<24){ diffHr++; }
	  else { week++;
		if(week===(weeks.length-1)){ week=0; }
	  }
	}
  }
  var minute=diffMin;
  var second=diffSec;
  var hour = diffHr;
  if(second<10){ second='0'+second; }
  if(minute<10){ minute='0'+minute; }
  if(hour<10){ hour='0'+hour; }
  document.getElementById(div_week).innerHTML='<b>'+weeks[week]+'</b>';
  document.getElementById(div_timer).innerHTML='<b>'+hour+':'+minute+':'+second+'</b>';
 },100);
}