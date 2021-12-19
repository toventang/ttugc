package com.p2082ss.android.ugc.aweme.simkit.impl.p3911b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84264a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84273i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84274j;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84276l;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.b.b */
public final class C74628b implements AbstractC84278n {

    /* renamed from: a */
    private final AbstractC80918i f167780a;

    static {
        Covode.recordClassIndex(87449);
    }

    public C74628b(AbstractC80918i iVar) {
        this.f167780a = iVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: a */
    public final C84274j mo117450a(AbstractC84278n.AbstractC84280a aVar) {
        AbstractC80918i b;
        C84273i a = aVar.mo129301a();
        C84241i iVar = a.f188459a;
        String[] strArr = a.f188461c;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i] + m131056a(strArr[i], iVar.getSourceId());
            }
        }
        Object a2 = this.f167780a.mo124063a(iVar, a.f188460b, strArr);
        if (AbstractC74616d.m131036a().mo117290b().getAppConfig().isDebug() && (b = C80937s.m140453b()) != null) {
            b.mo124079d(iVar);
        }
        return new C84274j(a2);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: b */
    public final C84274j mo117451b(AbstractC84278n.AbstractC84280a aVar) {
        C84241i iVar;
        AbstractC80918i b;
        C84264a b2 = aVar.mo129305b();
        C84235d dVar = b2.f188450a;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = new C84241i();
            if (dVar.getUrlKey() != null) {
                iVar.setSourceId(dVar.getUrlKey());
            }
            if (dVar.getFileHash() != null) {
                iVar.setFileHash(dVar.getFileHash());
            }
            iVar.setHeight(dVar.getHeight());
            iVar.setWidth(dVar.getWidth());
            iVar.setSize(dVar.getSize());
            if (dVar.getUri() != null) {
                iVar.setUri(dVar.getUri());
            }
            if (dVar.getUrlKey() != null) {
                iVar.setUrlKey(dVar.getUrlKey());
            }
            if (dVar.getUrlList() != null) {
                iVar.setUrlList(dVar.getUrlList());
            }
            if (dVar.getaK() != null) {
                iVar.setaK(dVar.getaK());
            }
        }
        String[] strArr = b2.f188452c;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i] + m131056a(strArr[i], iVar.getSourceId());
            }
        }
        Object a = this.f167780a.mo124063a(iVar, b2.f188451b, strArr);
        if (AbstractC74616d.m131036a().mo117290b().getAppConfig().isDebug() && (b = C80937s.m140453b()) != null) {
            b.mo124079d(iVar);
        }
        return new C84274j(a);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: c */
    public final C84274j mo117452c(AbstractC84278n.AbstractC84280a aVar) {
        C84241i iVar;
        AbstractC80918i b;
        C84276l c = aVar.mo129306c();
        C84232a aVar2 = c.f188464a;
        if (aVar2 == null) {
            iVar = null;
        } else {
            iVar = new C84241i();
            iVar.setSourceId(String.valueOf(aVar2.getSubId()));
            if (aVar2.getUrl() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar2.getUrl());
                iVar.setUrlList(arrayList);
            }
            if (aVar2.getUri() != null) {
                iVar.setUri(aVar2.getUri());
            }
        }
        String[] strArr = c.f188466c;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i] + m131056a(strArr[i], iVar.getSourceId());
            }
        }
        Object a = this.f167780a.mo124063a(iVar, c.f188465b, strArr);
        if (AbstractC74616d.m131036a().mo117290b().getAppConfig().isDebug() && (b = C80937s.m140453b()) != null) {
            b.mo124079d(iVar);
        }
        return new C84274j(a);
    }

    /* renamed from: a */
    private static String m131056a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("?")) {
            return "&source_id=".concat(String.valueOf(str2));
        }
        return "?&source_id=".concat(String.valueOf(str2));
    }
}
