package com.bytedance.ies.bullet.p1129c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16215n;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;

/* renamed from: com.bytedance.ies.bullet.c.d */
public interface AbstractC16239d extends AbstractC16212k {

    /* renamed from: com.bytedance.ies.bullet.c.d$a */
    public interface AbstractC16240a {
        static {
            Covode.recordClassIndex(18533);
        }

        /* renamed from: a */
        void mo25820a(AbstractC16241b bVar);
    }

    /* renamed from: com.bytedance.ies.bullet.c.d$b */
    public interface AbstractC16241b {
        static {
            Covode.recordClassIndex(18534);
        }

        /* renamed from: a */
        AbstractC16239d mo25656a();
    }

    static {
        Covode.recordClassIndex(18532);
    }

    /* renamed from: a */
    AbstractC16203d<?, ?, ?, ?> mo25681a(EnumC16723b bVar);

    /* renamed from: a */
    List<AbstractC16203d<?, ?, ?, ?>> mo25684a();

    /* renamed from: a */
    void mo25685a(AbstractC16212k kVar);

    /* renamed from: a */
    void mo25686a(AbstractC16215n nVar, C16238z zVar, Uri uri, List<String> list, C16248b bVar, AbstractC89187q<? super AbstractC16208i, ? super Uri, ? super Boolean, C89391z> qVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    /* renamed from: b */
    C16248b mo25688b();

    /* renamed from: b */
    void mo25689b(AbstractC16212k kVar);
}
