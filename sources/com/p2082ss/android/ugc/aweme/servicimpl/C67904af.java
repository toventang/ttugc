package com.p2082ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40980o;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63228bl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C76002c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4003c.C76003a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4003c.DialogC76004b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.af */
public final class C67904af implements AbstractC63228bl {
    static {
        Covode.recordClassIndex(80073);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63228bl
    /* renamed from: a */
    public final Dialog mo101712a(Effect effect, DialogInterface.OnDismissListener onDismissListener, Handler handler, Activity activity) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(onDismissListener, "");
        C89219l.m154721d(handler, "");
        C89219l.m154721d(activity, "");
        if (effect == null || !C76002c.f170765d) {
            return null;
        }
        String a = C40980o.m82513a(C63247i.f143610a, C63253l.f143623a.mo73323s().mo93851a()).mo70161a("upload_pic_sticker_show", "");
        if (!TextUtils.isEmpty(a)) {
            C89219l.m154716b(a, "");
            if (C89361p.m154908a((CharSequence) a, (CharSequence) effect.getEffectId(), false)) {
                return null;
            }
        }
        C76003a aVar = new C76003a();
        List<String> list = C76002c.f170762a;
        C89219l.m154721d(list, "");
        aVar.f170770d = list;
        C89219l.m154721d(effect, "");
        try {
            JSONObject jSONObject = new JSONObject(effect.getExtra());
            aVar.f170769c = jSONObject.optString("pixaloop_text");
            aVar.f170767a = jSONObject.optString("pixaloop_picture_cover");
            aVar.f170768b = jSONObject.optString("pixaloop_video_cover");
        } catch (Exception e) {
            e.printStackTrace();
        }
        DialogC76004b bVar = new DialogC76004b(activity, effect, aVar);
        C89219l.m154721d(handler, "");
        bVar.f170773b = handler;
        bVar.setOnDismissListener(onDismissListener);
        return bVar;
    }
}
