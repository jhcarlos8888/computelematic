//Animacion en dispositivos moviles fondo y titulo de productos y servicios
window.addEventListener("scroll", function () {
  const elementsList = document.querySelectorAll(
    "#computadores, #impresoras,#celulares,#tablets,#videoJuegos,#sistemasDePuntoDeVenta,#camarasDeVigilancia,#seguridadYTelecomunicaciones,#accesoriosDeTecnologia,#insumosParaImpresoras,#equiposDeSublimacion,#soporteTecnico,#diseñoGrafico,#programacionDeSoftware,#marketing"
  );
  const elementsArray = [...elementsList];
  elementsArray.forEach((element) => {
    //console.log(element);
    if (
      element.id === "computadores" ||
      element.id === "impresoras" ||
      element.id === "celulares" ||
      element.id === "tablets" ||
      element.id === "videoJuegos" ||
      element.id === "sistemasDePuntoDeVenta" ||
      element.id === "camarasDeVigilancia" ||
      element.id === "seguridadYTelecomunicaciones" ||
      element.id === "accesoriosDeTecnologia" ||
      element.id === "insumosParaImpresoras" ||
      element.id === "equiposDeSublimacion" ||
      element.id === "soporteTecnico" ||
      element.id === "diseñoGrafico" ||
      element.id === "programacionDeSoftware" ||
      element.id === "marketing"
    ) {
      let elem = $("#" + element.id);
      let posicionObj1 = element.getBoundingClientRect().top;
      //console.log(posicionObj1);
      let tamañoPantalla = window.innerHeight / 3.5;
      if (posicionObj1 < tamañoPantalla) {
        //console.log("APLICANDO EFECTOS")
        elem.addClass("animateClass");
      } else {
        elem.removeClass("animateClass");
      }
    }
  });
});
