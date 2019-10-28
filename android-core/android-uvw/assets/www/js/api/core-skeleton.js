function body_bg_loader(imgURL){
 $('body').css({ 'width':window.innerWidth+'px', 'height':window.innerHeight+'px', 'color':'#fff;',
 'background-image':'url("'+imgURL+'")', 'background-position':'0px 0px',
 'background-repeat':'repeat-x'});
}