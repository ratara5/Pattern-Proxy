package com.raymond.proxy;

import com.raymond.inter.ICuenta;
import com.raymond.inter.impl.CuentaBancoAImpl;
import com.raymond.model.Cuenta;

import java.util.logging.Logger;


public class CuentaProxy implements ICuenta {

    private CuentaBancoAImpl cuentaReal;
    private final static Logger LOGGER=Logger.getLogger(CuentaProxy.class.getName());

    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if(cuentaReal==null) {
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.retirarDinero(cuenta, monto);
        }else{
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----"); //no se está mostrando logger en cada método sobreescrito
        if(cuentaReal==null){
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        }else{
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("----Cuenta Proxy - Mostrar Saldo----");
        if(cuentaReal==null){
            cuentaReal = new CuentaBancoAImpl();
            cuentaReal.mostrarSaldo(cuenta);
        }else{
            cuentaReal.mostrarSaldo(cuenta);
        }

    }

}
