package ies;

/**
 * Clase Empleado que define atributos y métodos para guardar y gestionar la
 * información personal de los empleados de una empresa
 * @author Rafael Álvaro Palomares Linares
 * @version 1.0
 * since version 1.0
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
     * @param emp_no Numero del empleado
     * @param nombre Nombre del empleado
     * @param apellido Apellido del empleado
     * @param pobla Población en la que reside el empleado
     * @param oficio Puesto que desempenha el empleado en la empresa
     * @param salario Salario mensual del empleado
     * @param dept Departamento al que pertenece el empleado
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
     * @author Rafael Álvaro Palomares Linares RAPL
     * @param emp_no Numero del empleado
     * @param nombre nombre Nombre del empleado
     * @param salario Salario mensual del empleado
     * @param dept Departamento al que pertenece el empleado
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

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public Departamento getDept() {
		return dept;
	}

	public void setDept(Departamento dept) {
		this.dept = dept;
	}
	
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}