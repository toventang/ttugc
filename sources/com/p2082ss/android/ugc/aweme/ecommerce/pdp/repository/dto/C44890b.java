package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43326i;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b */
public final class C44890b extends C43612a<C44889a> {

    /* renamed from: b */
    public static final int f104728b = (C43326i.m86445b().f101102a * 1000);

    /* renamed from: c */
    public static final C44891a f104729c = new C44891a((byte) 0);

    /* renamed from: a */
    public long f104730a;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b$a */
    public static final class C44891a {
        static {
            Covode.recordClassIndex(53296);
        }

        private C44891a() {
        }

        public /* synthetic */ C44891a(byte b) {
            this();
        }
    }

    private /* synthetic */ C44890b() {
        this(-1, null, null);
    }

    static {
        Covode.recordClassIndex(53295);
    }

    /* renamed from: b */
    public final boolean mo76080b() {
        if (SystemClock.elapsedRealtime() - this.f104730a > ((long) f104728b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo76079a() {
        T t;
        List<ProductPackStruct> list;
        ProductPackStruct productPackStruct;
        Integer num;
        if (!isCodeOK() || (t = this.data) == null || (list = t.f104725a) == null || list.isEmpty() || (productPackStruct = (ProductPackStruct) C89070n.m154583g((List) this.data.f104725a)) == null || (num = productPackStruct.f104675c) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C44890b mo76078a(C44890b bVar) {
        C44889a aVar;
        C89219l.m154721d(bVar, "");
        int i = this.code;
        String str = this.message;
        T t = this.data;
        if (t != null) {
            aVar = t.mo76077a(bVar.data);
        } else {
            aVar = null;
        }
        C44890b bVar2 = new C44890b(i, str, aVar);
        bVar2.f104730a = this.f104730a;
        return bVar2;
    }

    private C44890b(int i, String str, C44889a aVar) {
        super(i, str, aVar);
        this.f104730a = SystemClock.elapsedRealtime();
    }
}
