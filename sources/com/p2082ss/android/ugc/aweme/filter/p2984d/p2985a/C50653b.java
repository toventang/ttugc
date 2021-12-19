package com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50647b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50753a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50755b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.d.a.b */
public final class C50653b extends C50753a {
    static {
        Covode.recordClassIndex(59815);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e, com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50753a
    /* renamed from: a */
    public final List<C50698f> mo86014a() {
        List list;
        mo86115d();
        String[] strArr = mo86114c().f117146a;
        String[] strArr2 = mo86114c().f117147b;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            mo86114c();
            int intValue = mo86114c().f117148c[i2].intValue();
            int i4 = -1 - i2;
            String valueOf = String.valueOf(i4);
            String str2 = strArr2[i2];
            if (i2 == 0) {
                list = C89070n.m154524c("normal");
            } else {
                list = C89086z.INSTANCE;
            }
            arrayList.add(new C50698f(i4, valueOf, str, str2, null, list, null, Uri.parse("res://" + this.f117138a.getPackageName() + '/' + intValue), ""));
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e, com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50753a
    /* renamed from: a */
    public final C50721d mo86013a(int i) {
        C50721d a = super.mo86013a(i);
        if (C50647b.m94905a()) {
            return new C50721d(a.f117088a, mo86113b(-1 - i));
        }
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50653b(Context context, String str, int i, List<C89378p<int[], String>> list, AbstractC27255q<C50755b> qVar, AndroidResourceFilterBackupPreferences androidResourceFilterBackupPreferences) {
        super(context, str, i, list, qVar, androidResourceFilterBackupPreferences);
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(androidResourceFilterBackupPreferences, "");
    }
}
