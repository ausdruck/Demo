package com.baidu.carlife.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.baidu.carlife.core.C1253f;
import com.baidu.carlife.core.C1260i;
import com.baidu.carlife.core.C1261k;

class BtDeviceManager$1 extends BroadcastReceiver {
    /* renamed from: a */
    final /* synthetic */ C1043a f2638a;

    BtDeviceManager$1(C1043a this$0) {
        this.f2638a = this$0;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        this.f2638a.m3363a(intent);
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            BluetoothDevice device = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int prevState = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
            int state = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            String addr = device.getAddress();
            C1260i.m4435b(C1043a.f2661C, "ACTION_CONNECTION_STATE_CHANGED: remote addr = " + addr + ",state = " + state + ",HU's addr = " + this.f2638a.f2693M);
            if (!(TextUtils.isEmpty(addr) || TextUtils.isEmpty(this.f2638a.f2693M) || !this.f2638a.f2693M.equals(addr))) {
                switch (state) {
                    case 0:
                        this.f2638a.m3390l();
                        break;
                    case 2:
                        this.f2638a.m3388j();
                        break;
                }
            }
            if (!TextUtils.isEmpty(addr)) {
                C1261k.m4463b(C1253f.hC, prevState, state);
            }
        }
    }
}
