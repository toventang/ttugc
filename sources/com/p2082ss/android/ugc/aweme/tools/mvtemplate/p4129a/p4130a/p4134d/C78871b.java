package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.property.C65402co;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.b */
public final class C78871b extends AbstractC78851a {

    /* renamed from: d */
    public static final C78872a f177265d = new C78872a((byte) 0);

    static {
        Covode.recordClassIndex(92020);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.b$a */
    public static final class C78872a {
        static {
            Covode.recordClassIndex(92021);
        }

        private C78872a() {
        }

        public /* synthetic */ C78872a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78871b(C78859b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        MvThemeData mvThemeData;
        if (obj instanceof ArrayList) {
            if (SettingsManager.m29616a().mo25400a("enable_1080p_photo_mv", false) || C65402co.C65403a.m117104a().f147549a) {
                mvThemeData = m137672a((ArrayList) obj, 1080);
            } else {
                mvThemeData = m137672a((ArrayList) obj, 720);
            }
            if (mvThemeData != null) {
                AbstractC78856e eVar = this.f177238a;
                if (eVar != null) {
                    eVar.mo122701a(mvThemeData);
                    return;
                }
                return;
            }
            AbstractC78856e eVar2 = this.f177238a;
            if (eVar2 != null) {
                eVar2.mo122701a(((ArrayList) obj).get(0));
                return;
            }
            return;
        }
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177329l = "mv list pass error";
        }
        C78899d dVar2 = this.f177240c.f177249f;
        if (dVar2 != null) {
            dVar2.f177328k = 3;
        }
        AbstractC78853c cVar = this.f177240c.f177251h;
        if (cVar != null) {
            cVar.mo122696a();
        }
    }

    /* renamed from: a */
    private static MvThemeData m137672a(ArrayList<?> arrayList, int i) {
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MvThemeData) {
                MvThemeData mvThemeData = (MvThemeData) next;
                if (mvThemeData.f177190g == i) {
                    return mvThemeData;
                }
            }
        }
        return null;
    }
}
