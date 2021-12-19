package com.p2082ss.android.ugc.aweme.video.p4211e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.video.local.C80770e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84264a;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84273i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84274j;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84276l;
import java.util.ArrayList;
import java.util.HashSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.e.a */
public final class C80721a implements AbstractC84278n {

    /* renamed from: a */
    public static final C80721a f180466a = new C80721a();

    /* renamed from: c */
    private static final HashSet<String> f180467c = new HashSet<>();

    private C80721a() {
    }

    static {
        Covode.recordClassIndex(94008);
    }

    /* renamed from: b */
    private static void m139946b(String str) {
        f180467c.add(str);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: a */
    public final C84274j mo117450a(AbstractC84278n.AbstractC84280a aVar) {
        C84241i iVar;
        C84273i a = aVar.mo129301a();
        if (a == null || (iVar = a.f188459a) == null) {
            C84274j a2 = aVar.mo129303a(a);
            if (a2 == null) {
                C89219l.m154715b();
            }
            return a2;
        } else if (f180467c.contains(iVar.getSourceId())) {
            return new C84274j(iVar.getUri());
        } else {
            C84274j a3 = aVar.mo129303a(a);
            if (a3 == null) {
                C89219l.m154715b();
            }
            return a3;
        }
    }

    /* renamed from: a */
    public static Aweme m139945a(String str) {
        C89219l.m154721d(str, "");
        Aweme aweme = new Aweme();
        Video video = new Video();
        C80770e eVar = new C80770e();
        eVar.setSourceId(str);
        eVar.setUri(str);
        eVar.setUrlList(new ArrayList());
        eVar.getUrlList().add(eVar.getUri());
        eVar.setUrlKey(str);
        video.setPlayAddr(eVar);
        video.setPlayAddrBytevc1(video.getPlayAddr());
        aweme.setVideo(video);
        aweme.setAid(str);
        m139946b(str);
        return aweme;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: c */
    public final C84274j mo117452c(AbstractC84278n.AbstractC84280a aVar) {
        C84241i iVar;
        C84276l c = aVar.mo129306c();
        if (c == null || c.f188464a == null) {
            C84274j a = aVar.mo129304a(c);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
        C84232a aVar2 = c.f188464a;
        if (aVar2 == null) {
            iVar = null;
        } else {
            iVar = new C84241i();
            iVar.setSourceId(String.valueOf(aVar2.getSubId()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar2.getUrl());
            iVar.setUrlList(arrayList);
            iVar.setUri(aVar2.getUri());
        }
        C89219l.m154716b(iVar, "");
        if (f180467c.contains(iVar.getSourceId())) {
            return new C84274j(iVar.getUri());
        }
        C84274j a2 = aVar.mo129304a(c);
        if (a2 == null) {
            C89219l.m154715b();
        }
        return a2;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n
    /* renamed from: b */
    public final C84274j mo117451b(AbstractC84278n.AbstractC84280a aVar) {
        C84241i iVar;
        C84264a b = aVar.mo129305b();
        if (b == null || b.f188450a == null) {
            C84274j a = aVar.mo129302a(b);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
        C84235d dVar = b.f188450a;
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
        C89219l.m154716b(iVar, "");
        if (f180467c.contains(iVar.getSourceId())) {
            return new C84274j(iVar.getUri());
        }
        C84274j a2 = aVar.mo129302a(b);
        if (a2 == null) {
            C89219l.m154715b();
        }
        return a2;
    }
}
