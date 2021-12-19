package com.bytedance.bae.router.controller;

import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.IAudioRoutingController;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ControllerStartState extends ControllerBaseState {
    static {
        Covode.recordClassIndex(15046);
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public int getState() {
        return 1;
    }

    ControllerStartState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        if (iAudioRoutingController.getRoutingInfo().getDefaultRouting() == 0) {
            if (isAudioOnlyCall()) {
                iAudioRoutingController.getRoutingInfo().setDefaultRouting(2);
            } else {
                iAudioRoutingController.getRoutingInfo().setDefaultRouting(3);
            }
        }
        this.mAudioRoutingController.resetAudioRouting(false);
        BaeLogging.m23630w("ControllerBaseState", "Monitor start ctor: default routing: " + this.mAudioRoutingController.getAudioRouteDesc(iAudioRoutingController.getRoutingInfo().getDefaultRouting()) + ", current routing: " + this.mAudioRoutingController.getAudioRouteDesc(this.mAudioRoutingController.queryCurrentAudioRouting()));
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public void onEvent(int i, int i2) {
        BaeLogging.m23630w("ControllerBaseState", "Monitor startState: onEvent: " + i + ", info: " + i2);
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i == 10) {
                    this.mAudioRoutingController.getRoutingInfo().setDefaultRouting(i2);
                    this.mAudioRoutingController.resetAudioRouting(true);
                    BaeLogging.m23630w("ControllerBaseState", "User set default routing to:" + this.mAudioRoutingController.getAudioRouteDesc(this.mAudioRoutingController.getRoutingInfo().getDefaultRouting()));
                } else if (i == 11) {
                    this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i2);
                    if (!sPhoneInCall) {
                        this.mAudioRoutingController.resetAudioRouting(true);
                    }
                } else if (i == 15) {
                    if (i2 == 1) {
                        z = true;
                    }
                    boolean bTScoEnabled = this.mAudioRoutingController.getRoutingInfo().getBTScoEnabled();
                    BaeLogging.m23630w("ControllerBaseState", "CMD_ENABLE_BT_SCO old_enable:" + bTScoEnabled + ", new_enable:" + z);
                    if (bTScoEnabled != z) {
                        this.mAudioRoutingController.getRoutingInfo().setBTScoEnabled(z);
                        this.mAudioRoutingController.resetAudioRouting(true);
                    }
                } else if (i == 21) {
                    sEngineRole = i2;
                    if (!sPhoneInCall) {
                        this.mAudioRoutingController.updateBluetoothSco(this.mAudioRoutingController.queryCurrentAudioRouting());
                    }
                } else if (i != 22) {
                    super.onEvent(i, i2);
                } else {
                    BaeLogging.m23628i("ControllerBaseState", "phone state changed: ".concat(String.valueOf(i2)));
                    if (i2 > 0) {
                        z = true;
                    }
                    sPhoneInCall = z;
                    if (i2 == 0) {
                        this.mAudioRoutingController.resetAudioRouting(true);
                    }
                }
            } else if (!sPhoneInCall) {
                this.mAudioRoutingController.resetAudioRouting(false);
            }
        } else if (!sPhoneInCall && !this.mAudioRoutingController.isBTHeadsetPlugged()) {
            this.mAudioRoutingController.resetAudioRouting(false);
        }
    }
}
