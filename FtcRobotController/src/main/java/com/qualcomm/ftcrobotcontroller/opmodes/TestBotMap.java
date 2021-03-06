package com.qualcomm.ftcrobotcontroller.opmodes;

import android.graphics.Path;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.DeviceManager;
 
/**
 * Created by Andreaslc1103 on 9/6/2016.
 */
public abstract class TestBotMap extends OpMode {


    DcMotor Right;
    DcMotor Left;

    @Override
    public void init_loop() {

        Right = hardwareMap.dcMotor.get("Right Motor");
        Left = hardwareMap.dcMotor.get("Left Motor");


        Right.setPower(0);
        Left.setPower(9);



    }

    @Override
    public void loop() {

    }
}
