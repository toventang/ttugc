package com.bytedance.bae.router.controller;

import com.bytedance.bae.router.IAudioRoutingController;
import com.bytedance.covode.number.Covode;

public class EventDispatcher {
    private IAudioRoutingController mAudioRoutingController;
    private ControllerBaseState mRoutingState;

    static {
        Covode.recordClassIndex(15049);
    }

    private void errorRoutingControl() {
        this.mRoutingState = new ControllerErrorState(this.mAudioRoutingController);
    }

    private void startRoutingControl() {
        this.mRoutingState = new ControllerStartState(this.mAudioRoutingController);
    }

    private void stopRoutingControl() {
        this.mRoutingState = new ControllerStopState(this.mAudioRoutingController);
    }

    public EventDispatcher(IAudioRoutingController iAudioRoutingController) {
        ControllerBaseState.init();
        this.mAudioRoutingController = iAudioRoutingController;
        this.mRoutingState = new ControllerStopState(iAudioRoutingController);
    }

    public void changeRouteState(int i) {
        if (i != this.mRoutingState.getState()) {
            if (i == 1) {
                startRoutingControl();
            } else if (i != 2) {
                errorRoutingControl();
            } else {
                stopRoutingControl();
            }
        }
    }

    public void onEvent(int i, int i2) {
        this.mRoutingState.onEvent(i, i2);
    }
}
