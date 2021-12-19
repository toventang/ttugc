package com.bytedance.ies.bullet.p1184ui.common;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.ui.common.h */
public interface AbstractC17046h extends AbstractC16212k, AbstractC16239d.AbstractC16240a, AbstractC16246a {

    /* renamed from: com.bytedance.ies.bullet.ui.common.h$b */
    public interface AbstractC17048b {
        static {
            Covode.recordClassIndex(19497);
        }

        /* renamed from: a */
        void mo25851a(Uri uri);

        /* renamed from: a */
        void mo25852a(Uri uri, Throwable th);

        /* renamed from: a */
        void mo25853a(View view, Uri uri, AbstractC16208i iVar);

        /* renamed from: a */
        void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar);

        /* renamed from: a */
        void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z);
    }

    static {
        Covode.recordClassIndex(19495);
    }

    /* renamed from: a */
    void mo26838a(Uri uri, Bundle bundle, AbstractC17048b bVar);

    /* renamed from: a */
    void mo26839a(View view, int i, int i2, int i3, int i4, int i5);

    void onEvent(AbstractC16191p pVar);

    /* renamed from: com.bytedance.ies.bullet.ui.common.h$a */
    public static final class C17047a {
        static {
            Covode.recordClassIndex(19496);
        }

        /* renamed from: a */
        public static /* synthetic */ void m31518a(AbstractC17046h hVar, Uri uri, Bundle bundle, AbstractC17048b bVar, int i) {
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                bVar = null;
            }
            hVar.mo26838a(uri, bundle, bVar);
        }
    }
}
