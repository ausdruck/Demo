package com.baidu.navisdk.comapi.routeguide;

import android.os.Message;

public interface IRGSubStatusListener {
    void onArriveDest(Message message);

    void onArriveDestNear(Message message);

    void onReRouteCarFree(Message message);

    void onReRouteComplete(Message message);

    void onRoutePlanYawing(Message message);
}
