package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50813c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50690b;
import com.p2082ss.android.ugc.tools.utils.C84907n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.a */
public class C50753a implements AbstractC50722e {

    /* renamed from: a */
    public final Context f117138a;

    /* renamed from: b */
    public final AbstractC27255q<C50755b> f117139b;

    /* renamed from: c */
    private final AbstractC89244h f117140c = C89250i.m154773a((AbstractC89171a) new C50754a(this));

    /* renamed from: d */
    private final String f117141d;

    /* renamed from: e */
    private final int f117142e;

    /* renamed from: f */
    private final List<C89378p<int[], String>> f117143f;

    /* renamed from: g */
    private final AndroidResourceFilterBackupPreferences f117144g;

    static {
        Covode.recordClassIndex(59921);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C50755b mo86114c() {
        return (C50755b) this.f117140c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e
    /* renamed from: b */
    public final void mo86097b() {
        this.f117144g.setResourcesVersion(-1);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.a$a */
    static final class C50754a extends AbstractC89220m implements AbstractC89171a<C50755b> {

        /* renamed from: a */
        final /* synthetic */ C50753a f117145a;

        static {
            Covode.recordClassIndex(59922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50754a(C50753a aVar) {
            super(0);
            this.f117145a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C50755b invoke() {
            return this.f117145a.f117139b.mo5560b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo86115d() {
        if (this.f117142e != this.f117144g.getResourcesVersion()) {
            for (T t : this.f117143f) {
                C84907n.m145914a(this.f117138a, (int[]) t.getFirst(), (String) t.getSecond());
            }
            this.f117144g.setResourcesVersion(this.f117142e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e
    /* renamed from: a */
    public List<C50698f> mo86014a() {
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

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e
    /* renamed from: a */
    public final boolean mo86096a(C50698f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar.f117047a < 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo86113b(int i) {
        return C50690b.m94983a(this.f117141d) + mo86114c().f117149d[i];
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e
    /* renamed from: a */
    public C50721d mo86013a(int i) {
        File parentFile;
        String a = C50813c.m95170a(mo86113b(-1 - i));
        String str = "";
        C89219l.m154721d(a, str);
        if (!TextUtils.isEmpty(a)) {
            File file = new File(a);
            if (file.exists() && file.isFile() && (parentFile = file.getParentFile().getParentFile()) != null && parentFile.exists() && parentFile.isDirectory()) {
                String absolutePath = parentFile.getAbsolutePath();
                C89219l.m154716b(absolutePath, str);
                str = absolutePath;
            }
        }
        return new C50721d(a, str);
    }

    public C50753a(Context context, String str, int i, List<C89378p<int[], String>> list, AbstractC27255q<C50755b> qVar, AndroidResourceFilterBackupPreferences androidResourceFilterBackupPreferences) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(androidResourceFilterBackupPreferences, "");
        this.f117138a = context;
        this.f117141d = str;
        this.f117142e = i;
        this.f117143f = list;
        this.f117139b = qVar;
        this.f117144g = androidResourceFilterBackupPreferences;
    }
}
