class UICommons {
 appNotificationsHeader_view_icons(){
  return (new UICommons().appNotificationsHeader_view_tasks()
    +'<div class="container-fluid" style="height:51px;background-color:#3885dd;padding-left:15px;padding-right:15px;">'
	+'<div class="row">'
	+'<div align="center" class="col-md-2 col-sm-4 col-xs-1 pad0"></div>'
	+'<div align="center" class="col-md-2 col-sm-4 col-xs-2 pad0">'
	+'<a href="#" id="notify-notificationsrequest" data-toggle="tooltip" data-placement="bottom" title="Notifications" '
	+'onclick="javascript:notify_notificationrequest_effect_stop();">'
	+'<div style="margin-top:16px;">'
	+'<i id="notify-notificationsrequest-icon" style="color:#fff;" class="fa fa-trophy fa-notify-icon white-font" '
	+'aria-hidden="true"></i>'
	+'&nbsp;&nbsp;<span id="notify-notificationsrequest-badge" class="badge badge-notify1">3</span>'
	+'</div>'
	+'</a>'
	+'</div>'
	+'<div align="center" class="col-md-2 col-sm-4 col-xs-2 pad0">'
	+'<a href="#" id="notify-notificationsrequest" data-toggle="tooltip" data-placement="bottom" title="Notifications" '
	+'onclick="javascript:notify_notificationrequest_effect_stop();">'
	+'<div style="margin-top:16px;" data-toggle="modal" data-target="#uiCommonsTaskNotifyHeaderModal" data-backdrop="static">'
	+'<i id="notify-notificationsrequest-icon" style="color:#fff;" class="fa fa-wpforms fa-notify-icon white-font" '
	+'aria-hidden="true"></i>'
	+'&nbsp;&nbsp;<span id="notify-notificationsrequest-badge" class="badge badge-notify1">3</span>'
	+'</div>'
	+'</a>'
	+'</div>'
	+'<div align="center" class="col-md-2 col-sm-4 col-xs-2 pad0">'
	+'<a href="#" id="notify-notificationsrequest" data-toggle="tooltip" data-placement="bottom" title="Notifications" '
	+'onclick="javascript:notify_notificationrequest_effect_stop();">'
	+'<div style="margin-top:16px;">'
	+'<i id="notify-notificationsrequest-icon" style="color:#fff;" class="fa fa-envelope fa-notify-icon white-font" '
	+'aria-hidden="true"></i>'
	+'&nbsp;&nbsp;<span id="notify-notificationsrequest-badge" class="badge badge-notify1">3</span>'
	+'</div>'
	+'</a>'
	+'</div>'
	+'<div align="center" class="col-md-2 col-sm-4 col-xs-2 pad0">'
	+'<a href="#" id="notify-notificationsrequest" data-toggle="tooltip" data-placement="bottom" title="Notifications" '
	+'onclick="javascript:notify_notificationrequest_effect_stop();">'
	+'<div style="margin-top:16px;">'
	+'<i id="notify-notificationsrequest-icon" style="color:#fff;" class="fa fa-bell fa-notify-icon white-font" '
	+'aria-hidden="true"></i>'
	+'&nbsp;<span id="notify-notificationsrequest-badge" class="badge badge-notify1">3</span>'
	+'</div>'
	+'</a>'
	+'</div>'
	+'<div align="center" class="col-md-2 col-sm-4 col-xs-3">'
	+'<a href="#" id="notify-notificationsrequest" data-toggle="tooltip" data-placement="bottom" title="Notifications" '
	+'onclick="javascript:notify_notificationrequest_effect_stop();">'
	+'<div style="margin-top:8px;">'
	+'<i id="notify-notificationsrequest-icon" style="color:#fff;" class="fa fa-2x fa-cog fa-spin white-font" '
	+'aria-hidden="true"></i>'
	+'</div>'
	+'</a>'
	+'</div>'
	+'</div>'
	+'</div>'
  );
 }
 appStatisticsHeader_view(){
   return ('<div class="container-fluid" style="height:60px;background-color:#03a9f4;color:#fff;padding-top:10px;padding-bottom:10px;">'
    +'<div class="row">'
    +'<div align="left" class="col-xs-4">'
    +'<div><i class="fa fa-money"></i>:&nbsp;<i class="fa fa-inr"></i>&nbsp;<b>10000</b></div>'
    +'<div><span class="label label-primary-o"><i class="fa fa-university"></i>&nbsp;<b>Go Bank</b></span></div>'
    +'</div>'
    +'<div align="left" class="col-xs-4">'
    +'<div class="row">'
    +'<div class="col-xs-2 pad0"><i class="fa fa-heart"></i>&nbsp;</div>'
    +'<div class="col-xs-7 pad0">'
    +'<div class="progress">'
	+'<div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" '
	+'style="width:70%">'
	+'<span class="sr-only">70% Complete</span>'
	+'</div>'
	+'</div>'
	+'</div>'
	+'<div align="center" class="col-xs-2 pad0"><i class="fa fa-plus-circle"></i>&nbsp;</div>'
	+'</div>'
	+'<div class="row">'
	+'<div class="col-xs-2 pad0"><i class="fa fa-cutlery"></i>&nbsp;</div>'
	+'<div class="col-xs-7 pad0">'
	+'<div class="progress">'
	+'<div class="progress-bar" role="progressbar" aria-valuenow="70" '
	+'aria-valuemin="0" aria-valuemax="100" style="width:70%">'
	+'<span class="sr-only">70% Complete</span>'
	+'</div>'
	+'</div>'
	+'</div>'
	+'<div align="center" class="col-xs-2 pad0"><i class="fa fa-plus-circle"></i>&nbsp;</div>'
	+'</div>'
    +'</div>'
    +'<div align="left" class="col-xs-4 pad0">'
	+'<div><i class="fa fa-clock-o"></i>&nbsp;<span id="gt_timer"><b>00:00:00</b></span></div>'
	+'<div><i class="fa fa-calendar"></i>&nbsp;<span id="gt_week"><b>00:00:00</b></span></div>'
	+'</div>'
    +'</div>'
    +'</div>'
   );
 }
 appFooter_view(){
  return ('<div class="footer" style="height:65px;background-color:#3885dd;overflow-x:scroll;overflow-y:hidden;">'
	+'<ul id="appMenuList" class="list-inline" style="padding-left:15px;">'
	+'<li id="appMenuList_home" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="app-game-dashboard.html" class="font-lgtRed">'
	+'<div><i class="fa fa-2x fa-home"></i></div>'
	+'<div>Home</div>'
	+'</a>' 
	+'</li>'
	+'<li id="appMenuList_profile" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
    +'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-user"></i></div>'
	+'<div>Profile</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_property" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-university"></i></div>'
	+'<div>Property</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_career" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
    +'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-graduation-cap"></i></div>'
	+'<div>Career</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_job" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-briefcase"></i></div>'
	+'<div>Job</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_profession" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-suitcase"></i></div>'
	+'<div>Profession</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_market" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-industry"></i></div>'
	+'<div>Market</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_bank" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-money"></i></div>'
	+'<div>Bank</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_neighborhood" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-group"></i></div>'
	+'<div>My Neighborhood</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_shopping" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'	
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-shopping-basket"></i></div>'
	+'<div>Shopping</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_education" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-book"></i></div>'
	+'<div>Education</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_entertainment" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-film"></i></div>'
	+'<div>Entertainment</div>'
	+'</a>'
	+'</li>'    
	+'<li id="appMenuList_society" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'  
	+'<a href="#" class="font-white">'  
	+'<div><i class="fa fa-2x fa-globe"></i></div>'
	+'<div>Society</div>'	
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_govt" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-briefcase"></i></div>'
	+'<div>Government</div>'
	+'</a>'
	+'</li>'
	+'<li id="appMenuList_inviteFriends" align="center" onclick="javascript:appFooterMenu_sel(this.id);">'
	+'<a href="#" class="font-white">'
	+'<div><i class="fa fa-2x fa-group"></i></div>'
	+'<div>Invite Friends</div>'
	+'</a>'
	+'</li>'
	+'</ul>'
	+'</div>'  
  );
 }
 appNotificationsHeader_view_tasks(){
  return (
    '<style>'
	+'.timerTask-grey { background-color:#ccc;padding:8px; }'
	+'</style>'
    +'<div id="uiCommonsTaskNotifyHeaderModal" class="modal fade" role="dialog">'
	+'<div class="modal-dialog">'
	+'<div class="modal-content">'
    +'<div class="modal-header">'
    +'<button type="button" class="close" data-dismiss="modal">&times;</button>'
    +'<h5 align="center" class="modal-title"><b>Tasks to Complete !!!</b></h5>'
    +'</div>'
    +'<div id="appNotifications_tasks_info" class="modal-body pad0">'
	
    +'<div class="list-group mbot0">'
	+'<div class="list-group-item pad8" style="background-color:#f3fbff;">'
	+'<div><h5 class="lh25p"><b>Find a Job within 60 days from the completion of your Tenth Standard</b></h5></div>'
	+'<div class="mtop15p lh25p"><i>You are the citizen of India. '
	+'Citizen without Job after Tenth Standard is considered as Offender and may keep you in Jail.</i></div>'
	+'<div align="right" class="mtop15p">'
	
	+'<div style="color:red;font-size:11px;">Still Remaining time</div>'
	+'<div><h4><b>'
	+'<span class="timerTask-grey">00</span> : <span class="timerTask-grey">00</span> : <span class="timerTask-grey">00</span>'
	+'</b></h4></div>'
	+'</div>'
	
	+'<div align="right" class="mtop25p">'
	+'<div class="btn-group">'
	+'<button class="btn btn-success-o"><b>Go to Recruitment Center</b></button>'
	+'<button class="btn btn-danger-o"><b>Go by Backdoor</b></button>'
	+'</div>'
	+'</div>'
	
	+'</div>'
	+'</div>'
	
    +'</div>'
    +'</div>'
	+'</div>'
	+'</div>');
 }
}
class UIHome {
 gui_display(){
   var guiHeight = window.innerHeight - 273;
   return ('<div style="background-image:url(\'images/bg/2.jpg\');width:100%;height:'+guiHeight+'px;overflow:hidden;">'
	+'<div class="container-fluid">'
	+'<div class="row">'
	+'<div class="col-xs-1"></div>'
	+'<div class="col-xs-6" style="color:#777;padding:5px;margin-top:5px;background-color:#fff;border:1px solid #777;">'
	+'<div>I got my 10th Standard Certificate. Now, I need to search for a Job.</div>'
	+'<div align="right"><span class="label label-default">Ok</span></div>'
	+'</div>'
	+'<div class="col-xs-1"></div>'
	+'<div class="col-xs-4" '
	+'style="color:#777;padding:5px;margin-top:5px;height:55px;background-color:#fff;border:1px solid #777;">'
	+'<div align="center"><b>Find your Job</b></div>'
	+'<div align="center"><b>in 60 DAYS</b></div>'
	+'</div>'
	+'</div>'
	+'<div class="row">'
	+'<div class="col-xs-3"></div>'
    +'<img style="margin-top:25px" class="col-md-2 col-sm-2 col-xs-6" src="images/avadhuta.png"/>'
	+'<div class="col-xs-3"></div>'
	+'</div>'
	+'</div>'
	+'</div>'
   );
 }
 offersNewsNeighborhood(){
   return (new UIHome().watchNews_view_modal()+'<div class="container-fluid">'
	+'<div class="row">'
	+'<div class="col-xs-4 pad0">'
	+'<div class="list-group borderRad0">'
	+'<div align="center" class="list-group-item bg-pink" style="height:97px;padding-left:0px;padding-right:0px;">'
	+'<div style="margin-top:5px;"><i class="fa fa-2x fa-group"></i></div>'
	+'<div style="margin-top:5px;font-size:13px;"><b>claim Offers</b></div>'
	+'</div>'
	+'</div>'
	+'</div>'
	+'<div class="col-xs-4 pad0">'
	+'<div class="list-group borderRad0">'
	+'<div align="center" class="list-group-item bg-purple" style="height:97px;padding-left:0px;padding-right:0px;" '
	+'data-toggle="modal" data-target="#uiHomeWatchNewsModal" data-backdrop="static">'
	+'<div style="margin-top:5px;"><i class="fa fa-2x fa-newspaper-o"></i></div>'
	+'<div style="margin-top:5px;font-size:13px;"><b>Watch News</b></div>'
	+'</div>'
	+'</div>'
	+'</div>'
	+'<div class="col-xs-4 pad0">'
	+'<div class="list-group borderRad0">'
	+'<div id="apphome_onn_seeNeighborhood" align="center" class="list-group-item bg-red" '
	+'style="height:97px;padding-left:0px;padding-right:0px;" '
	+'>'
	+'<div style="margin-top:5px;"><i class="fa fa-2x fa-group"></i></div>'
	+'<div style="margin-top:5px;font-size:13px;"><b>See your Neighborhood</b></div>'
	+'</div>'
	+'</div>'
	+'</div>'
	+'</div>'
	+'</div>'
   );
 }
 watchNews_view_modal(){
  return ('<div id="uiHomeWatchNewsModal" class="modal fade" role="dialog">'
	+'<div class="modal-dialog">'
	+'<div class="modal-content">'
    +'<div class="modal-header">'
    +'<button type="button" class="close" data-dismiss="modal">&times;</button>'
    +'<h5 class="modal-title"><b>See What\'s Happening</b></h5>'
    +'</div>'
    +'<div class="modal-body pad0">'
	+'<div class="container-fluid">'
	+'<div class="row" style="border:1px solid #fff;">'
	+'<div class="col-xs-3 bg-yellow padleft8"><b>Highlights</b></div>'
	+'<marquee class="col-xs-9 bg-lgtGreen">Iran declares to increase oil Price for 3% on current Price.</marquee>'
	+'</div>'
	+'<div class="row">'
    +'<div class="col-xs-12 pad0"><img src="images/gif/news-reporter.gif" style="width:100%;"/></div>'
	+'</div>'
	
	+'<div class="row" style="border:1px solid #fff;">'
	+'<div class="col-xs-3 bg-pink padleft8"><b>Global</b></div>'
	+'<marquee class="col-xs-9 bg-grey">India Rupee value increased in the Global Foreign Market.</marquee>'
	+'</div>'
	
	+'<div class="row" style="border:1px solid #fff;">'
	+'<div class="col-xs-3 bg-blue padleft8"><b>National</b></div>'
	+'<marquee class="col-xs-9 bg-lgtGreen">Modi became the Prime Minister of Virtual India.</marquee>'
	+'</div>'
	
	+'<div class="row" style="border:1px solid #fff;">'
	+'<div class="col-xs-3 bg-purple padleft8"><b>State</b></div>'
	+'<marquee class="col-xs-9 bg-cream">TSRTC Union demands to move them from Corporation to State Employees.</marquee>'
	+'</div>'
	
	+'<div class="row" style="border:1px solid #fff;">'
	+'<div class="col-xs-3 bg-greenBlue padleft8"><b>Local</b></div>'
	+'<marquee class="col-xs-9 bg-lgtBlue-v1">Chief Minister of Virtual Telangana, K Chandrashekar Rao reacted on the response of TSRTC Union.</marquee>'
	+'</div>'
	
	+'</div>'
	
	
    +'</div>' // modal-body
    +'</div>'
    +'</div>'
	+'</div>' );
 }
 
}
var uiCommons = new UICommons();
var uiHome = new UIHome();