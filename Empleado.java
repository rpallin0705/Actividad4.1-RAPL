package ies;

/**
 * Clase Empleado que define atributos y métodos para guardar y gestionar la
 * información personal de los empleados de una empresa
 * 
 * @author Rafael Álvaro Palomares Linares
 * @version 1.0
 *          since version 1.0
 */
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;
	private Departamento dept;

	/**
	 * Constructor de la clase empleado
	 * 
	 * @param emp_no   Numero del empleado
	 * @param nombre   Nombre del empleado
	 * @param apellido Apellido del empleado
	 * @param pobla    Población en la que reside el empleado
	 * @param oficio   Puesto que desempenha el empleado en la empresa
	 * @param salario  Salario mensual del empleado
	 * @param dept     Departamento al que pertenece el empleado
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
		this.dept = dept;
	}

	/**
	 * Segundo Constructor de la clase empleado
	 * 
	 * @author Rafael Álvaro Palomares Linares RAPL
	 * @param emp_no  Numero del empleado
	 * @param nombre  nombre Nombre del empleado
	 * @param salario Salario mensual del empleado
	 * @param dept    Departamento al que pertenece el empleado
	 * @deprecated Este método se eliminará en la proxima versión del programa
	 * @version 0.5
	 * @since 0.5
	 */
	public Empleado(int emp_no, String nombre, Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		this.dept = dept;
	}

	/**
	 * Método get del atributo emp_no (numero de empleado)
	 * 
	 * @return Valor entero emp_no
	 * @version 0.5
	 * @since 0.5
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * Metodo set del atributo emp_no (numero de empleado)
	 * 
	 * @param emp_no Numero del empleado
	 * @version 1.0
	 * @since 0.5
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * Método get del atributo nombre (nombre del empleado)
	 * 
	 * @return Valor String del atributo nombre
	 * @version 0.5
	 * @since 0.5
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del atributo apellido (apellido del empleado)
	 * 
	 * @param nombre Nombre del empleado
	 * @version 0.5
	 * @since 0.5
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método get del atributo pobla (poblacion del empleado)
	 * 
	 * @return Valor String del atributo pobla
	 * @version 1.0
	 * @since 0.5
	 */
	public String getPobla() {
		return pobla;
	}

	/**
	 * Método set del atributo pobla (poblacion del empleado)
	 * 
	 * @param pobla Población en la que reside el empleado
	 * @version 1.0
	 * @since 0.5
	 */
	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	/**
	 * Método get del atributo oficio (puesto que desempenha el empleado en la
	 * empresa)
	 * 
	 * @return Valor String del atributo oficio
	 * @version 1.0
	 * @since 0.5
	 */
	public String getOficio() {
		return oficio;
	}

	/**
	 * Método set del atributo oficio (puesto que desempenha el empleado en la
	 * empresa)
	 * 
	 * @param oficio Puesto que desempenha el empleado en la empresa
	 * @version 1.0
	 * @since 0.5
	 */
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	/**
	 * Metodo get del atributo salario (salario del empleado)
	 * 
	 * @return Valor Double del atributo salario
	 * @version 0.5
	 * @since 0.5
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * Metodo set del atributo salario (salario del empleado)
	 * 
	 * @param salario Salario mensual del empleado
	 * @version 1.0
	 * @since 0.5
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/**
	 * Metodo get del atributo dept (departamento al que pertenece el empleado)
	 * 
	 * @return Valor Departamento del atributo dept
	 * @version 0.5
	 * @since 0.5
	 */
	public Departamento getDept() {
		return dept;
	}

	/**
	 * Metodo set del atributo dept (departamento al que pertenece el empleado)
	 * 
	 * @param dept Departamento al que pertenece el empleado
	 * @version 1.0
	 * @since 0.5
	 */
	public void setDept(Departamento dept) {
		this.dept = dept;
	}

	/**
	 * Metodo para dar una subida de salario a un empleadp
	 * @author Rafael Álvaro Palomares Linares
	 * @param subida Cantidad de dinero (€) que se va a añadir al salario de un empleado
	 * @version 1.1
	 * @throws IllegalArgumentException El salario que se va a sumar al antiguo salario no puede ser negativo
	 */
	public void subidasalario(Double subida) throws IllegalArgumentException{
		if (subida <= 0 ) throw new IllegalArgumentException;
		else salario = salario + subida;
	}

	/**
	 * Metodo para comprobar el nombre de un empleado está vacío en la base de datos
	 * 
	 * @return boolean que verifica si el nombre del empleado está o no almacenado
	 * @author Rafael Alvaro Palomares Linares RAPL
	 * @version 1.1
	 * @see getNombre()
	 * @todo Implementar la lógica para gestionar la comprobación del nombre de un usuario en la base de datos
	 */
	private boolean comprobar() {
		if (getNombre().equals("")) {

			return false;
		}
		return true;
	}
}