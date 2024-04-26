package com.example.buensaborback;

import com.example.buensaborback.domain.entities.*;
import com.example.buensaborback.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;

@SpringBootApplication
public class BuenSaborBackApplication {
// Aca tiene que inyectar todos los repositorios
// Es por ello que deben crear el paquete repositorio

// Ejemplo  @Autowired
//	private ClienteRepository clienteRepository;

    private static final Logger logger = LoggerFactory.getLogger(BuenSaborBackApplication.class);

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PaisRepository paisRepository;

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private LocalidadRepository localidadRepository;

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    @Autowired
    private ImagenRepository imagenRepository;

    @Autowired
    private PromocionRepository promocionRepository;

    public static void main(String[] args) {
        SpringApplication.run(BuenSaborBackApplication.class, args);
        logger.info("Estoy activo en el main");
    }


    @Bean
    CommandLineRunner init() {
        return args -> {
            logger.info("----------------ESTOY----FUNCIONANDO---------------------");
            // Etapa del dashboard
            // Crear 1 pais
            // Crear 2 provincias para ese pais
            // crear 2 localidades para cada provincia
            Pais pais1 = Pais.builder().nombre("Argentina").build();
            Provincia provincia1 = Provincia.builder().nombre("Mendoza").pais(pais1).build();
            Provincia provincia2 = Provincia.builder().nombre("Cordoba").pais(pais1).build();
            Localidad localidad1 = Localidad.builder().nombre("Lujan de Cuyo").provincia(provincia1).build();
            Localidad localidad2 = Localidad.builder().nombre("Godoy Cruz").provincia(provincia1).build();
            Localidad localidad3 = Localidad.builder().nombre("Achiras").provincia(provincia2).build();
            Localidad localidad4 = Localidad.builder().nombre("Agua de Oro").provincia(provincia2).build();

            paisRepository.save(pais1);
            provinciaRepository.save(provincia1);
            provinciaRepository.save(provincia2);
            localidadRepository.save(localidad1);
            localidadRepository.save(localidad2);
            localidadRepository.save(localidad3);
            localidadRepository.save(localidad4);

            // Crear 1 empresa
            // Crear 2 sucursales para esa empresa
            // crear los Domicilios para esas sucursales
            Empresa empresaBrown = Empresa.builder().nombre("Lo de Brown").cuil(30503167).razonSocial("Venta de Alimentos").build();
            empresaBrown.setSucursales(new HashSet<>());

            Sucursal sucursalChacras = Sucursal.builder().nombre("En chacras").horarioApertura(LocalTime.of(17, 0)).horarioCierre(LocalTime.of(23, 0)).build();
            sucursalChacras.setCategorias(new HashSet<>());
            sucursalChacras.setPromociones(new HashSet<>());
            Sucursal sucursalGodoyCruz = Sucursal.builder().nombre("En godoy cruz").horarioApertura(LocalTime.of(16, 0)).horarioCierre(LocalTime.of(23, 30)).build();
            sucursalGodoyCruz.setCategorias(new HashSet<>());
            sucursalGodoyCruz.setPromociones(new HashSet<>());

            sucursalChacras.setEmpresa(empresaBrown);
            sucursalGodoyCruz.setEmpresa(empresaBrown);

            Domicilio domicilioViamonte = Domicilio.builder().cp(5509).calle("Viamonte").numero(500).localidad(localidad1).build();
            Domicilio domicilioSanMartin = Domicilio.builder().cp(5511).calle("San Martin").numero(789).localidad(localidad2).build();

            sucursalChacras.setDomicilio(domicilioViamonte);
            sucursalGodoyCruz.setDomicilio(domicilioSanMartin);

            empresaRepository.saveAndFlush(empresaBrown); // Guardar y forzar la ejecución inmediata
            domicilioRepository.save(domicilioViamonte);
            domicilioRepository.save(domicilioSanMartin);

            sucursalRepository.save(sucursalChacras);
            sucursalRepository.save(sucursalGodoyCruz);

            // Crear Unidades de medida
            UnidadMedida unidadMedidaLitros = UnidadMedida.builder().denominacion("Litros").build();
            UnidadMedida unidadMedidaGramos = UnidadMedida.builder().denominacion("Gramos").build();
            UnidadMedida unidadMedidaCantidad = UnidadMedida.builder().denominacion("Cantidad").build();
            UnidadMedida unidadMedidaPorciones = UnidadMedida.builder().denominacion("Porciones").build();
            unidadMedidaRepository.save(unidadMedidaLitros);
            unidadMedidaRepository.save(unidadMedidaGramos);
            unidadMedidaRepository.save(unidadMedidaCantidad);
            unidadMedidaRepository.save(unidadMedidaPorciones);

            // Crear Categorías de productos y subCategorías de los mismos
            Categoria categoriaBebidas = Categoria.builder().denominacion("Bebidas").build();
            categoriaBebidas.setSubcategorias(new HashSet<>());
            categoriaBebidas.setArticuloInsumos(new HashSet<>());
            categoriaBebidas.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaBebidas);
            Categoria categoriaGaseosas = Categoria.builder().denominacion("Gaseosas").categoriaPadre(categoriaBebidas).build();
            categoriaGaseosas.setSubcategorias(new HashSet<>());
            categoriaGaseosas.setArticuloInsumos(new HashSet<>());
            categoriaGaseosas.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaGaseosas);
            Categoria categoriaTragos = Categoria.builder().denominacion("Tragos").categoriaPadre(categoriaBebidas).build();
            categoriaTragos.setSubcategorias(new HashSet<>());
            categoriaTragos.setArticuloInsumos(new HashSet<>());
            categoriaTragos.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaTragos);
            Categoria categoriaPizzas = Categoria.builder().denominacion("Pizzas").build();
            categoriaPizzas.setSubcategorias(new HashSet<>());
            categoriaPizzas.setArticuloInsumos(new HashSet<>());
            categoriaPizzas.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaPizzas);
            categoriaBebidas.getSubcategorias().add(categoriaGaseosas);
            categoriaBebidas.getSubcategorias().add(categoriaTragos);
            categoriaRepository.save(categoriaBebidas);

            // Categorias de insumos
            Categoria categoriaLacteos = Categoria.builder().denominacion("Lacteo").build();
            categoriaLacteos.setSubcategorias(new HashSet<>());
            categoriaLacteos.setArticuloInsumos(new HashSet<>());
            categoriaLacteos.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaLacteos);
            Categoria categoriaFrutas = Categoria.builder().denominacion("Frutas").build();
            categoriaFrutas.setSubcategorias(new HashSet<>());
            categoriaFrutas.setArticuloInsumos(new HashSet<>());
            categoriaFrutas.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaFrutas);
            Categoria categoriaHarinas = Categoria.builder().denominacion("Harinas").build();
            categoriaHarinas.setSubcategorias(new HashSet<>());
            categoriaHarinas.setArticuloInsumos(new HashSet<>());
            categoriaHarinas.setArticuloManufacturados(new HashSet<>());
            categoriaRepository.save(categoriaHarinas);

            // Crear Insumos , coca cola , harina , etc
            ArticuloInsumo cocaCola =
                    ArticuloInsumo.builder().denominacion("Coca cola").unidadMedida(unidadMedidaLitros).esParaElaborar(false).stockActual(5).stockMaximo(50).precioCompra(50.0).precioVenta(70.0).categoria(categoriaBebidas).build();
            ArticuloInsumo harina =
                    ArticuloInsumo.builder().denominacion("Harina").unidadMedida(unidadMedidaGramos).esParaElaborar(true).stockActual(4).stockMaximo(40).precioCompra(40.0).precioVenta(60.5).categoria(categoriaHarinas).build();
            ArticuloInsumo queso =
                    ArticuloInsumo.builder().denominacion("Queso").unidadMedida(unidadMedidaGramos).esParaElaborar(true).stockActual(20).stockMaximo(50).precioCompra(23.6).precioVenta(66.6).categoria(categoriaLacteos).build();
            ArticuloInsumo tomate =
                    ArticuloInsumo.builder().denominacion("Tomate").unidadMedida(unidadMedidaCantidad).esParaElaborar(true).stockActual(20).stockMaximo(50).precioCompra(23.6).precioVenta(66.6).categoria(categoriaFrutas).build();

            // crear fotos para cada insumo
            Imagen imagenCoca =
                    Imagen.builder().url("https://m.media-amazon.com/images/I/51v8nyxSOYL._SL1500_.jpg").build();
            Imagen imagenHarina = Imagen.builder().url("https://mandolina.co/wp-content/uploads/2023/03/648366622" +
                    "-1024x683.jpg").build();
            Imagen imagenQueso = Imagen.builder().url("https://superdepaso.com" +
                    ".ar/wp-content/uploads/2021/06/SANTAROSA-PATEGRAS-04.jpg").build();
            Imagen imagenTomate = Imagen.builder().url("https://thefoodtech.com/wp-content/uploads/2020/06" +
                    "/Componentes-de-calidad-en-el-tomate-828x548.jpg").build();
            imagenRepository.save(imagenCoca);
            imagenRepository.save(imagenHarina);
            imagenRepository.save(imagenQueso);
            imagenRepository.save(imagenTomate);

            cocaCola.setImagen(imagenCoca);
            harina.setImagen(imagenHarina);
            queso.setImagen(imagenQueso);
            tomate.setImagen(imagenTomate);
            articuloInsumoRepository.save(cocaCola);
            articuloInsumoRepository.save(harina);
            articuloInsumoRepository.save(queso);
            articuloInsumoRepository.save(tomate);

            // Crear Articulos Manufacturados
            ArticuloManufacturado pizzaMuzarella =
                    ArticuloManufacturado.builder().denominacion("Pizza Muzarella").descripcion("Una pizza clasica").unidadMedida(unidadMedidaPorciones).precioVenta(130.0).tiempoEstimadoMinutos(15).categoria(categoriaPizzas).build();
            ArticuloManufacturado pizzaNapolitana =
                    ArticuloManufacturado.builder().denominacion("Pizza Napolitana").descripcion("Una pizza napolitana").unidadMedida(unidadMedidaPorciones).precioVenta(150.0).tiempoEstimadoMinutos(15).categoria(categoriaPizzas).build();


            // Crear fotos para los artículos manufacturados
            Imagen imagenPizzaMuzarella = Imagen.builder().url("https://storage.googleapis" +
                    ".com/fitia-api-bucket/media/images/recipe_images/1002846.jpg").build();
            Imagen imagenPizzaNapolitana = Imagen.builder().url("https://assets.elgourmet" +
                    ".com/wp-content/uploads/2023/03/8metlvp345_portada-pizza-1024x686.jpg.webp").build();
            imagenRepository.save(imagenPizzaMuzarella);
            imagenRepository.save(imagenPizzaNapolitana);

            pizzaMuzarella.setImagen(imagenPizzaMuzarella);
            pizzaNapolitana.setImagen(imagenPizzaNapolitana);

            // Establcer las relaciones entre estos objetos.
            pizzaMuzarella.getArticulosInsumos().add(harina);
            pizzaMuzarella.getArticulosInsumos().add(queso);
            pizzaNapolitana.getArticulosInsumos().add(harina);
            pizzaNapolitana.getArticulosInsumos().add(queso);
            pizzaNapolitana.getArticulosInsumos().add(tomate);
            articuloManufacturadoRepository.save(pizzaMuzarella);
            articuloManufacturadoRepository.save(pizzaNapolitana);

            // Establecer relaciones de las categorias
            categoriaGaseosas.getArticuloInsumos().add(cocaCola);
            categoriaPizzas.getArticuloManufacturados().add(pizzaMuzarella);
            categoriaPizzas.getArticuloManufacturados().add(pizzaNapolitana);
            categoriaRepository.save(categoriaGaseosas);
            categoriaRepository.save(categoriaPizzas);

            // Crear promocion para sucursal - Dia de los enamorados
            // Tener en cuenta que esa promocion es exclusivamente para una sucursal determinada d euna empresa
            // determinada
            Promocion promocionDiaEnamorados = Promocion.builder().denominacion("Dia de los Enamorados")
                    .fechaDesde(LocalDate.of(2024, 2, 13))
                    .fechaHasta(LocalDate.of(2024, 2, 15))
                    .horaDesde(LocalTime.of(0, 0))
                    .horaHasta(LocalTime.of(23, 59))
                    .descuento(25.6)
                    .sucursal(sucursalChacras)
                    .build();
            promocionDiaEnamorados.setArticulosInsumos(new HashSet<>());
            promocionDiaEnamorados.setArticuloManufacturados(new HashSet<>());
            promocionDiaEnamorados.getArticulosInsumos().add(cocaCola);
            promocionDiaEnamorados.getArticuloManufacturados().add(pizzaNapolitana);
            promocionRepository.save(promocionDiaEnamorados);

            //Agregar categorias y promociones a sucursales
            sucursalChacras.getCategorias().add(categoriaBebidas);
            sucursalChacras.getCategorias().add(categoriaPizzas);
            sucursalChacras.getPromociones().add(promocionDiaEnamorados);

            sucursalGodoyCruz.getCategorias().add(categoriaBebidas);
            sucursalGodoyCruz.getCategorias().add(categoriaPizzas);

            sucursalRepository.save(sucursalChacras);
            sucursalRepository.save(sucursalGodoyCruz);

            logger.info("Sucursal Chacras {}", sucursalChacras);
            logger.info("Sucursal Godoy Cruz {}", sucursalGodoyCruz);
        };
    }
}



