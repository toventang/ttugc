package dmt.p4542av.video.p4548e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.e.b */
public final class C88254b implements ISuperEntranceService {

    /* renamed from: a */
    public static final AbstractC89244h f200294a = C89250i.m154773a((AbstractC89171a) C88256b.f200296a);

    /* renamed from: b */
    public static final C88255a f200295b = new C88255a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isNeedShowSuperEntranceTabDirect() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isSuperEntranceResReady() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void preDownloadSuperEntranceRes(Context context) {
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setShowedSuperEntranceTab() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setSuperEntranceRecordClicked(Context context, boolean z) {
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldShowSuperEntranceRecord(Context context) {
        C89219l.m154721d(context, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldStartSuperEntrance(Context context) {
        C89219l.m154721d(context, "");
        return false;
    }

    /* renamed from: dmt.av.video.e.b$a */
    public static final class C88255a {
        static {
            Covode.recordClassIndex(104290);
        }

        /* renamed from: a */
        public static C88254b m153365a() {
            return (C88254b) C88254b.f200294a.getValue();
        }

        private C88255a() {
        }

        public /* synthetic */ C88255a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final List<String> getSuperEntranceEffectList() {
        return C89086z.INSTANCE;
    }

    /* renamed from: dmt.av.video.e.b$b */
    static final class C88256b extends AbstractC89220m implements AbstractC89171a<C88254b> {

        /* renamed from: a */
        public static final C88256b f200296a = new C88256b();

        static {
            Covode.recordClassIndex(104291);
        }

        C88256b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88254b invoke() {
            return new C88254b();
        }
    }

    static {
        Covode.recordClassIndex(104289);
    }
}
