package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p499ui.C7794bg;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bh */
final /* synthetic */ class View$OnClickListenerC7804bh implements View.OnClickListener {

    /* renamed from: a */
    private final C7794bg f19371a;

    static {
        Covode.recordClassIndex(8599);
    }

    View$OnClickListenerC7804bh(C7794bg bgVar) {
        this.f19371a = bgVar;
    }

    public final void onClick(View view) {
        int indexOf;
        String str;
        C7794bg bgVar = this.f19371a;
        int id = view.getId();
        if (id == R.id.qq) {
            if (!bgVar.f19341i) {
                if (bgVar.f19340h) {
                    bgVar.f19340h = false;
                    bgVar.f19345m.mo18138a();
                } else {
                    bgVar.f19340h = true;
                    bgVar.f19345m.mo18139a(true);
                }
                bgVar.mo14063d();
            }
        } else if (id == R.id.cwt && !bgVar.f19341i) {
            if (bgVar.f19338f == C7794bg.EnumC7803a.Panel) {
                bgVar.f19338f = C7794bg.EnumC7803a.Keyboard;
            } else {
                bgVar.f19338f = C7794bg.EnumC7803a.Panel;
                if (!(bgVar.f19350r == null || bgVar.f19349q == bgVar.f19350r)) {
                    bgVar.f19349q = bgVar.f19350r;
                    if (bgVar.f19337e && (indexOf = bgVar.f19354v.indexOf(bgVar.f19349q)) != -1) {
                        bgVar.mo14058a(indexOf);
                        bgVar.f19346n.setCurrentItem(indexOf, false);
                    }
                }
            }
            bgVar.f19343k.post(new RunnableC7809bm(bgVar, bgVar.f19338f));
            bgVar.mo14065f();
            if (bgVar.f19338f == C7794bg.EnumC7803a.Keyboard) {
                str = "emoji_to_keyboard";
            } else {
                str = "keyboard_to_emoji";
            }
            C6501b.C6502a.m13948a("livesdk_emoji_keyboard_click").mo12639a().mo12651a("click_pattern", str).mo12655b();
        }
    }
}
