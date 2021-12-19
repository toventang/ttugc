package com.bytedance.android.livesdk.definition;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.definition.C8317c;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.definition.b */
public class C8316b implements AbstractC4051b {
    static {
        Covode.recordClassIndex(9154);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public boolean isAudienceLowestDefinition() {
        C8328d dVar = (C8328d) C89070n.m154588i((List) C8329e.m16485a());
        if (dVar != null) {
            return dVar.f20621c;
        }
        return false;
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void reportAnchorDefinitionBtnShow() {
        C6501b a = C6501b.C6502a.m13948a("livesdk_live_anchor_definition_selection_btn_show");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a.mo12646a("anchor_id", b.mo13161c()).mo12644a("screen_share").mo12655b();
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public C89378p<String, String> getNextLowerLevelDefinition() {
        List<C8328d> a = C8329e.m16485a();
        Iterator<T> it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (a.get(i).f20621c && i2 < a.size()) {
                return new C89378p<>(a.get(i2).mo14662b(), a.get(i2).mo14661a());
            }
            i = i2;
        }
        return null;
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void reportAudienceRotateBtnShow(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C6501b.C6502a.m13948a("livesdk_user_screen_rotate_btn_show").mo12651a("anchor_id", C8315a.m16470b()).mo12651a("room_id", str).mo12655b();
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void showDefinitionSelectionDialog(Context context, boolean z) {
        C8317c.C8318a.m16475a(context, z);
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void reportAudienceDefinitionBtnShow(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C8315a.m16468a(str, str2, str3);
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void reportAudienceRotateBtnClick(String str, long j, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C6501b.C6502a.m13948a("livesdk_user_screen_rotate_btn_click").mo12651a("anchor_id", C8315a.m16470b()).mo12651a("room_id", str).mo12651a("room_orientation_after", str2).mo12651a("duration", String.valueOf((System.currentTimeMillis() - j) / 1000)).mo12655b();
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void reportAudienceDefinitionTipsShow(String str, String str2, String str3) {
        String g;
        String str4 = "";
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str2, str4);
        C89219l.m154721d(str3, str4);
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str2, str4);
        C89219l.m154721d(str3, str4);
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, str4);
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, str4);
        String str5 = a.f28391b.f28233c.f28288E;
        if (str5 == null) {
            str5 = str4;
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a2, str4);
        AbstractC5777j b = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str5);
        if (!(b == null || (g = b.mo11547g()) == null)) {
            str4 = g;
        }
        C6501b.C6502a.m13948a("livesdk_live_definition_switch_show").mo12651a("anchor_id", C8315a.m16470b()).mo12651a("room_id", str).mo12651a("room_orientation", str3).mo12651a("current_definition", str4).mo12644a(str2).mo12655b();
    }

    @Override // com.bytedance.android.live.p229d.AbstractC4051b
    public void reportAudienceDefinitionDialogSelectSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C8315a.m16469a(str, str2, str3, str4, str5, str6, str7);
    }
}
