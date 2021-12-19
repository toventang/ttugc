package com.bytedance.android.livesdk.liveroom;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.livesdk.C6561ab;
import com.bytedance.android.livesdk.chatroom.detail.C7454r;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11658l;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11659m;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class RoomListener implements ISubController {
    C6561ab fragment;
    AbstractC11658l mRoomAction;
    AbstractC11659m mRoomEventListener;

    static {
        Covode.recordClassIndex(10241);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    public AbstractC11658l getRoomAction() {
        return this.mRoomAction;
    }

    public AbstractC11659m getRoomEventListener() {
        return this.mRoomEventListener;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
        initRoomEnvironment();
    }

    private String getLiveEnterMerge() {
        return C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28293J;
    }

    private String getLiveEnterMethod() {
        return C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28295L;
    }

    public boolean initRoomEnvironment() {
        if (this.mRoomAction == null) {
            this.mRoomAction = new AbstractC11658l() {
                /* class com.bytedance.android.livesdk.liveroom.RoomListener.C93101 */

                static {
                    Covode.recordClassIndex(10242);
                }

                @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11658l
                /* renamed from: a */
                public final void mo15450a() {
                    ActivityC0945e activity;
                    C7454r.C7455a.m15360a().mo13687a();
                    if (RoomListener.this.fragment != null && (activity = RoomListener.this.fragment.getActivity()) != null) {
                        activity.finish();
                    }
                }
            };
        }
        if (this.mRoomEventListener == null) {
            this.mRoomEventListener = new AbstractC11659m() {
                /* class com.bytedance.android.livesdk.liveroom.RoomListener.C93112 */

                static {
                    Covode.recordClassIndex(10243);
                }

                @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11659m
                /* renamed from: a */
                public final void mo15451a() {
                    if (RoomListener.this.fragment != null) {
                        ActivityC0945e activity = RoomListener.this.fragment.getActivity();
                        if (Build.VERSION.SDK_INT >= 21) {
                            C3903ac.m9534a((Activity) activity);
                        }
                    }
                }

                @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11659m
                /* renamed from: a */
                public final void mo15452a(boolean z) {
                    ActivityC0945e activity;
                    Window window;
                    if (RoomListener.this.fragment != null && (activity = RoomListener.this.fragment.getActivity()) != null && (window = activity.getWindow()) != null) {
                        if (!z) {
                            activity.getWindow().setFlags(1024, 1024);
                        } else if (C3931d.m9571a(activity)) {
                            window.clearFlags(1024);
                        }
                    }
                }
            };
        }
        if (this.mRoomAction == null || !C11115u.m19743a().mo17915b().mo13164d()) {
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", getLiveEnterMerge());
        hashMap.put("enter_method", getLiveEnterMethod());
        hashMap.put("source", "live room fg");
        C3868c.m9491a("ttlive_minor_mode_live", 1, hashMap);
        Event event = new Event("room_fg_enter_room_fail", 33028, EnumC11866b.BussinessApiCall);
        event.mo19003a("ftc or delete by age gate.");
        C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
        this.mRoomAction.mo15450a();
        return false;
    }

    public RoomListener(C6561ab abVar) {
        this.fragment = abVar;
    }
}
