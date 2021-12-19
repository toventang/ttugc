package com.p2082ss.android.ugc.aweme.publish.p3624h;

import android.app.Application;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65679l;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.h.k */
final class C65657k implements AbstractC65679l {
    static {
        Covode.recordClassIndex(77148);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.k$a */
    public static final class C65658a extends C27895a<ArrayList<String>> {
        static {
            Covode.recordClassIndex(77149);
        }

        C65658a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.k$b */
    public static final class C65659b extends C27895a<ArrayList<String>> {
        static {
            Covode.recordClassIndex(77150);
        }

        C65659b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.k$c */
    public static final class C65660c extends C27895a<ArrayList<String>> {
        static {
            Covode.recordClassIndex(77151);
        }

        C65660c() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65679l
    /* renamed from: b */
    public final void mo104826b() {
        C14401a aVar = new C14401a();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        ((IVideoRecordPreferences) aVar.mo23215a(application, IVideoRecordPreferences.class)).setPublishParallelUploadRecoverPath("");
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65679l
    /* renamed from: a */
    public final List<String> mo104823a() {
        C14401a aVar = new C14401a();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        ArrayList arrayList = (ArrayList) new C27910f().mo46671a(((IVideoRecordPreferences) aVar.mo23215a(application, IVideoRecordPreferences.class)).getPublishParallelUploadRecoverPath(""), new C65659b().type);
        if (arrayList != null) {
            return arrayList;
        }
        return C89086z.INSTANCE;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65679l
    /* renamed from: a */
    public final void mo104825a(String str) {
        C14401a aVar = new C14401a();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) aVar.mo23215a(application, IVideoRecordPreferences.class);
        if (str == null) {
            str = "";
        }
        iVideoRecordPreferences.setUploadRecoverPath(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65679l
    /* renamed from: b */
    public final void mo104827b(String str) {
        if (str != null) {
            C14401a aVar = new C14401a();
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) aVar.mo23215a(application, IVideoRecordPreferences.class);
            String publishParallelUploadRecoverPath = iVideoRecordPreferences.getPublishParallelUploadRecoverPath("");
            C27910f fVar = new C27910f();
            ArrayList arrayList = (ArrayList) fVar.mo46671a(publishParallelUploadRecoverPath, new C65658a().type);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            String b = fVar.mo46674b(arrayList);
            C89219l.m154716b(b, "");
            iVideoRecordPreferences.setPublishParallelUploadRecoverPath(b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65679l
    /* renamed from: c */
    public final void mo104828c(String str) {
        if (str != null) {
            C14401a aVar = new C14401a();
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) aVar.mo23215a(application, IVideoRecordPreferences.class);
            String publishParallelUploadRecoverPath = iVideoRecordPreferences.getPublishParallelUploadRecoverPath("");
            C27910f fVar = new C27910f();
            ArrayList arrayList = (ArrayList) fVar.mo46671a(publishParallelUploadRecoverPath, new C65660c().type);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.remove(str);
            String b = fVar.mo46674b(arrayList);
            C89219l.m154716b(b, "");
            iVideoRecordPreferences.setPublishParallelUploadRecoverPath(b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65679l
    /* renamed from: a */
    public final void mo104824a(ActivityC0945e eVar, C43223c cVar) {
        C89219l.m154721d(eVar, "");
        C65682o.m117574a(eVar, cVar);
    }
}
