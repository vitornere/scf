<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Bem Vindo ao Sistema de Controle de Fluxo</title>
        <style type="text/css" media="screen">
            #status {
                background-color: #eee;
                border: .2em solid #fff;
                margin: 2em 2em 1em;
                padding: 1em;
                width: 12em;
                float: left;
                -moz-box-shadow: 0px 0px 1.25em #ccc;
                -webkit-box-shadow: 0px 0px 1.25em #ccc;
                box-shadow: 0px 0px 1.25em #ccc;
                -moz-border-radius: 0.6em;
                -webkit-border-radius: 0.6em;
                border-radius: 0.6em;
            }
            .ie6 #status {
                display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
            }
            #status ul {
                font-size: 0.9em;
                list-style-type: none;
                margin-bottom: 0.6em;
                padding: 0;
            }
            #status li {
                line-height: 1.3;
            }
            #status h1 {
                text-transform: uppercase;
                font-size: 1.1em;
                margin: 0 0 0.3em;
            }
            #page-body {
                margin: 2em 1em 1.25em 18em;
            }
            h2 {
                margin-top: 1em;
                margin-bottom: 0.3em;
                font-size: 1em;
            }
            h3 {
                border-style: ridge;
                border-color: #A9A9A9;
                font-style: oblique;
                font-size: 20px;
                text-align: center;
            }
            p {
                line-height: 1.5;
                margin: 0.25em 0;
            }
            #controller-list ul {
                list-style-position: inside;
            }
            #controller-list li {
                line-height: 1.3;
                list-style-position: inside;
                margin: 0.25em 0;
            }
            @media screen and (max-width: 480px) {
                #status {
                    display: none;
                }
                #page-body {
                    margin: 0 1em 1em;
                }
                #page-body h1 {
                    margin-top: 0;
                }
            }
            div.img {
                margin: 5px;
                padding: 5px;
                border: 1px solid #0000ff;
                height: auto;
                width: auto;
                float: left;
                text-align: center;
            }
            div.img img {
                display: inline;
                margin: 5px;
                border: 1px solid #ffffff;
            }
            div.img a:hover img {
                border:1px solid #0000ff;
            }
            div.desc {
                text-align: left;
                font-weight: normal;
                width: 120px;
                margin: 5px;
            }
        </style>
    </head>
    <body>
        <a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div id="page-body" role="main">
            <h1>Sistema de Controle de Fluxo</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                        <th>Semestre</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <h3>Calc 1</h3> 
                            <h3>DIAC</h3> 
                            <h3>IAL</h3> 
                            <h3>EA</h3> 
                            <h3>Hum e Cid</h3> 
                            <h3>IA</h3> 
                        </td>
                        <td>
                            <h3>Calc 2</h3> 
                            <h3>CB</h3> 
                            <h3>Fis 1</h3> 
                            <h3>Prob e Est</h3> 
                            <h3>Eng Ec</h3> 
                            <h3>PDS</h3>
                            <h3>Fis Exp 1</h3>  
                        </td>
                        <td>
                            <h3>Métodos</h3> 
                            <h3>GPeQ</h3> 
                            <h3>SD1</h3> 
                            <h3>OO</h3> 
                            <h3>EMC</h3>
                        </td>
                        <td>
                            <h3>PI1</h3> 
                            <h3>Banco</h3> 
                            <h3>MDS</h3> 
                            <h3>FAC</h3> 
                            <h3>EDA</h3>
                            <h3>Paradigmas</h3>
                        </td>
                        <td>
                            <h3>FSO</h3> 
                            <h3>Tec Prog</h3> 
                            <h3>Requisitos</h3> 
                            <h3>IHellC</h3> 
                            <h3>Compiladores</h3>
                            <h3>EDA2</h3>
                            <h3>Tec M F de S</h3>
                        </td>
                        <td>
                            <h3>GPP</h3> 
                            <h3>DES</h3> 
                            <h3>Med Anal</h3> 
                            <h3>Veri Val</h3> 
                            <h3>Fund Redes</h3>
                        </td>
                        <td>
                            <h3>Manut e Evol</h3> 
                            <h3>DAS</h3> 
                            <h3>MPS</h3> 
                            <h3>GCS</h3> 
                            <h3>TEP</h3>
                        </td>
                        <td>
                            <h3>PI2</h3> 
                            <h3>PPS</h3> 
                            <h3>ES EXP</h3>
                        </td>
                        <td>
                            <h3>ES</h3> 
                            <h3>TCC1</h3> 
                            <h3>Seminarios</h3>
                        </td>
                        <td>
                            <h3>TCC2</h3> 
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
