package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c.a */
public final class C70982a {

    /* renamed from: a */
    public static final C70982a f158883a = new C70982a();

    private C70982a() {
    }

    static {
        Covode.recordClassIndex(83476);
    }

    /* renamed from: a */
    public static void m125336a(AbstractC22219j jVar) {
        C89219l.m154721d(jVar, "");
        View b = jVar.mo36474b(R.id.aqf);
        if (b == null) {
            C89219l.m154715b();
        }
        b.setVisibility(8);
    }

    /* renamed from: a */
    public static String m125334a(Context context, AbstractC32846a aVar) {
        String str;
        C89219l.m154721d(context, "");
        String string = context.getResources().getString(R.string.dm3);
        String str2 = null;
        if (aVar != null) {
            str = aVar.mo58659b();
            str2 = aVar.mo58658a();
            aVar.mo58665h();
        } else {
            str = null;
        }
        String obj = context.getResources().getText(R.string.u8).toString();
        StringBuilder append = new StringBuilder().append(string).append(" - @");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            obj = str;
        }
        String sb = append.append(obj).toString();
        C89219l.m154716b(sb, "");
        return sb;
    }

    /* renamed from: a */
    public static String m125335a(AbstractC32846a aVar, Resources resources) {
        String str = "";
        C89219l.m154721d(resources, str);
        String str2 = null;
        if (!C63244g.m114602a().mo73297y().mo93848b().booleanValue()) {
            if (aVar != null) {
                str2 = aVar.mo58658a();
            }
            if (!TextUtils.isEmpty(str2)) {
                if (aVar != null) {
                    str = aVar.mo58658a();
                }
                return resources.getText(R.string.u8).toString();
            } else if (!(aVar == null || aVar.mo58659b() == null)) {
                str = aVar.mo58659b();
            }
        } else {
            if (aVar != null) {
                str = aVar.mo58665h();
            }
            return resources.getText(R.string.u8).toString();
        }
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        return resources.getText(R.string.u8).toString();
    }
}
