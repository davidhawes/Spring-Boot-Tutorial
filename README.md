# Spring Boot Tutorial

### Spring Projektstruktur generieren
![image](https://user-images.githubusercontent.com/83290245/141694063-93dc6787-e131-41d1-bd5e-30b1a1388876.png)



### Simple Api

Erstellen eines neuen Packages "controller" und erstellen einer neuen java-Klasse "HelloController".
Enthalten sind hier @RestController, welche die Klasse zum Controller macht und @RequestMapping, welche die GET Methode verwendet.
![image](https://user-images.githubusercontent.com/83290245/141695935-a92e0697-eb83-49d4-900b-11b2c2320880.png)

@GetMapping beinhaltet RequestMapping, ist aber direkt mit der Methode GET definiert

![image](https://user-images.githubusercontent.com/83290245/141696205-46ac5dd0-44fb-4adf-b717-dc018a4bd10e.png)



### Programm ausführen

Ausführbar in Konsole und mit IntelliJ



#### IntelliJ
![image](https://user-images.githubusercontent.com/83290245/141696308-64bef151-0b10-4ad1-bd6f-a1e41065728a.png)



#### Konsole
![image](https://user-images.githubusercontent.com/83290245/141696244-cbb7537d-c6f4-407e-ac7b-59eacbebeef5.png)


### Hinzufügen von Devtools dependency
![image](https://user-images.githubusercontent.com/83290245/141696400-985db0da-09a8-44b1-86bd-4a961a182960.png)



### Hinzufügen von Spring Data JPA
![image](https://user-images.githubusercontent.com/83290245/141696694-41efe18d-c1c8-4739-ad2e-172681b84200.png)



### Datenbank configuration
Enablen von Webkonsole
Eingaben von datasources (username, password etc.)
![image](https://user-images.githubusercontent.com/83290245/141697358-104f9fc0-f86d-490e-9b9c-daef328532bb.png)

Webkonsole Anmeldung

![image](https://user-images.githubusercontent.com/83290245/141697915-d0f2d4f0-2eab-49d7-bc47-f56683e0e46d.png)



### Springboot Komponenten


Erstellen eines Entities mit dem Namen "Department"
Die Annotations @Entity und @Id geben an dass es eine Entity mit einer Id ist
@GeneratedValue generiert eine departmentId
![image](https://user-images.githubusercontent.com/83290245/141698070-3afd46c6-215c-4916-a230-b34f60ab5472.png)

DepartmentController, welcher die Daten mithilfe von den Services und dem Repository speichert
![image](https://user-images.githubusercontent.com/83290245/141698632-798c02bd-7c5f-4fbc-9171-8b9b78d05f2c.png)

#### APIs mit Insomnia testen
![image](https://user-images.githubusercontent.com/83290245/141699455-43f79f33-8acd-4138-8a85-fff9d623ee9c.png)
![image](https://user-images.githubusercontent.com/83290245/141699459-dc8b4f0b-adcf-4342-9b56-bf62ab9f4734.png)



### GetById
![image](https://user-images.githubusercontent.com/83290245/141702315-bf8a0863-3022-41a7-ae7b-ed930cb43fcd.png)
![image](https://user-images.githubusercontent.com/83290245/141702329-b90c8973-ee2b-4592-96f2-18aa755d60ea.png)



### Daten Löschen
![image](https://user-images.githubusercontent.com/83290245/141702516-8a77a28b-a895-4fcb-86ba-9adb5f21c6f0.png)

Die implementationn welche NULL und leere Zeichen überprüft
![image](https://user-images.githubusercontent.com/83290245/141703087-40b08b30-3d6d-423a-9651-ab6f760d4f82.png)



### Fetch by Name
Fetch Methode im Controller

![image](https://user-images.githubusercontent.com/83290245/141703871-bcc31843-6908-499a-8f95-d61c01748ab6.png)


Mit "IgnoreCase" kann man Groß- und Kleinschreibung ignorieren
![image](https://user-images.githubusercontent.com/83290245/141703824-23eb4a61-9d41-4453-add2-878dbd80db77.png)



### Validation
![image](https://user-images.githubusercontent.com/83290245/141704932-1946329c-2b0e-4e81-a9ce-bf4927908d62.png)



### Logging
Logging Dokumentation in den verschiedenen Methoden
![image](https://user-images.githubusercontent.com/83290245/141705228-a0189705-cb46-4da6-afbb-1d41aec7dbb9.png)



### Lombok um Boilerplate-Code zu verringern
![image](https://user-images.githubusercontent.com/83290245/141706061-f5bb4d46-a927-47f6-832a-88c64e5220f4.png)

Hier sieht man, dass die Getter u. Setter nicht mehr im code sind.
![image](https://user-images.githubusercontent.com/83290245/141706077-d85d34dd-ef05-4d94-98ad-73a90a87c3d8.png)



### Exception Handling

Custom Exception Klasse
![image](https://user-images.githubusercontent.com/83290245/141706664-eee4e7f5-6445-403b-be2b-1fdfa95323a5.png)

Exception bei der "Suche bei Id" - Methode
![image](https://user-images.githubusercontent.com/83290245/141706678-0a4caf80-293a-47a4-8aa3-19147c0aaad0.png)

Exceptionhandler für NOT_FOUND
![image](https://user-images.githubusercontent.com/83290245/141707117-95453a3b-0f45-4bbf-8ae2-32e9041f4a2d.png)



### Von H2 auf MySQL wechseln

Als aller erstes wird die andere Konfiguration gelöscht oder auskommentiert. Zunächst sollte dann die MySQL Datenbank installiert werden (falls sie noch nicht installiert ist.)
Die Konfigurationsdatei sieht dann so aus:
![image](https://user-images.githubusercontent.com/83290245/141828251-08f5c9ab-926b-4a09-ad33-78c2cdeb9489.png)

Da der Driver nicht ohne den MySQL connector funktioniert, muss man vorher/nachher diese Dependency einfügen
![image](https://user-images.githubusercontent.com/83290245/141828566-bf9dba48-42de-4ed5-bece-06b31173f8ba.png)

Zunächst muss dann ein neues Schema in der SQL Workbench erstellt werden

![image](https://user-images.githubusercontent.com/83290245/141828964-05c4d9f2-bbbd-46de-b1c7-ffb169b1f3a3.png)

Nach dem erstellen des Schemas und nach dem starten der Applikation sieht man dann sofort, dass Tables erstellt wurden
![image](https://user-images.githubusercontent.com/83290245/141829105-e3cbe9e6-8597-49d4-babf-22f68508a121.png)



### Service Layer testing 

In der DepartmentServiceTest-Klasse wird der Service Layer getestet.
1. @MockBean erstellt eine "MockRepository", um Testdaten darin zur erstellen
2. Die setUp() Methode erstellt vor dem Testdurchlauf (wegen @BeforeEach) Daten in der Repo
3. whenValidDepartmentName_thenDepartmentShouldFound() testet die Daten dann durch
![image](https://user-images.githubusercontent.com/83290245/141839150-1726b178-dd50-49fe-a448-e23353ff087b.png)



### Repo Layer testing
Hier wird der Repo Layer getestet
![image](https://user-images.githubusercontent.com/83290245/141842321-ca4b7a20-0bb1-4a87-ad01-c240b32fd6b3.png)



### Controller Layer testing

WebMvcTest
![image](https://user-images.githubusercontent.com/83290245/141846023-d84a66e5-27a9-4b43-a0de-c9d2388239da.png)

Save Department testing 
![image](https://user-images.githubusercontent.com/83290245/141845965-22b180f7-f72c-4e39-adb4-3263c3a42f1b.png)

Fetch Department testing
![image](https://user-images.githubusercontent.com/83290245/141847383-69596f7b-3090-45d4-b62f-e39376f493a5.png)



### Properties to yml
Für dies kann man einen online Converter verwenden.
Nachheriges Ergebnis

![image](https://user-images.githubusercontent.com/83290245/141851859-3bd3786d-ddc9-4a9d-9017-e24107e33233.png)



### Springboot Profiles

![image](https://user-images.githubusercontent.com/83290245/141853796-e3e7a7b8-89b6-4d04-bb09-f61fdb633026.png)




### Deployment von verschiedenen Spring Boot Application-Profile/Applications
#### Jars packagen
![image](https://user-images.githubusercontent.com/83290245/141854117-e219a143-ba12-40da-969d-eb8803ca6d85.png)

#### Jars Ausführen
Hier wird die Jar dann mit dem prod Profil ausgeführt
![image](https://user-images.githubusercontent.com/83290245/141854672-fd8971c7-d890-4355-8439-20dc70fc6e53.png)



### Spring Actuators
![image](https://user-images.githubusercontent.com/83290245/141855668-a7b295f5-d55a-4403-a6f4-0b74a6d65f35.png)

### Eigene Actuator endpoint implementation
![image](https://user-images.githubusercontent.com/83290245/141856806-ff855940-bf22-4673-9a34-2869e01e9636.png)

ENDE-----------------------------------------------------------------------------------------------------------
