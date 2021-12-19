package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4139d;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.C78839a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78857a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78950d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.CallableC78949c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.CallableC78951e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b */
public abstract class AbstractC78940b implements AbstractC63194at {

    /* renamed from: a */
    private final AbstractC89244h f177434a = C89250i.m154773a((AbstractC89171a) new C78941a(this));

    static {
        Covode.recordClassIndex(92089);
    }

    /* renamed from: a */
    public abstract Intent mo122742a(CutSameEditData cutSameEditData);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b$a */
    static final class C78941a extends AbstractC89220m implements AbstractC89171a<C789421> {

        /* renamed from: a */
        final /* synthetic */ AbstractC78940b f177435a;

        static {
            Covode.recordClassIndex(92090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78941a(AbstractC78940b bVar) {
            super(0);
            this.f177435a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C789421 invoke() {
            return new AbstractC63194at.AbstractC63195a(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4139d.AbstractC78940b.C78941a.C789421 */

                /* renamed from: a */
                final /* synthetic */ C78941a f177436a;

                static {
                    Covode.recordClassIndex(92091);
                }

                /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b$a$1$b */
                public static final class C78944b implements AbstractC78852b {

                    /* renamed from: a */
                    final /* synthetic */ IServiceMusicResDownListener f177439a;

                    static {
                        Covode.recordClassIndex(92093);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b
                    /* renamed from: a */
                    public final void mo122694a() {
                        IServiceMusicResDownListener iServiceMusicResDownListener = this.f177439a;
                        if (iServiceMusicResDownListener != null) {
                            iServiceMusicResDownListener.onFailed();
                        }
                    }

                    C78944b(IServiceMusicResDownListener iServiceMusicResDownListener) {
                        this.f177439a = iServiceMusicResDownListener;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b
                    /* renamed from: a */
                    public final void mo122695a(MusicModel musicModel, String str, boolean z) {
                        C89219l.m154721d(musicModel, "");
                        C89219l.m154721d(str, "");
                        IServiceMusicResDownListener iServiceMusicResDownListener = this.f177439a;
                        if (iServiceMusicResDownListener != null) {
                            iServiceMusicResDownListener.onSuccess(musicModel, str);
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: b */
                public final String mo101658b() {
                    String b = C78948b.m137768b("mvres");
                    C89219l.m154716b(b, "");
                    return b;
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: c */
                public final String mo101661c() {
                    String b = C78948b.m137767b();
                    C89219l.m154716b(b, "");
                    return b;
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: d */
                public final void mo101663d() {
                    C1731i.m5640b(new CallableC78943a(this, new LinkedHashSet()), C1731i.f5562a);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: a */
                public final String mo101653a() {
                    String str = (C78948b.m137762a("cover_tmp") + File.separator) + C78948b.m137769c(".png");
                    C89219l.m154716b(str, "");
                    return str;
                }

                /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b$a$1$a */
                static final class CallableC78943a<V> implements Callable {

                    /* renamed from: a */
                    final /* synthetic */ C789421 f177437a;

                    /* renamed from: b */
                    final /* synthetic */ Set f177438b;

                    static {
                        Covode.recordClassIndex(92092);
                    }

                    CallableC78943a(C789421 r1, Set set) {
                        this.f177437a = r1;
                        this.f177438b = set;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        List<C43223c> queryAllDraftList = AVServiceImpl.m113116a().draftService().queryAllDraftList(false);
                        C89219l.m154716b(queryAllDraftList, "");
                        for (T t : queryAllDraftList) {
                            C89219l.m154716b(t, "");
                            C61288d dVar = t.f100900W.f100753M;
                            if (dVar != null) {
                                Set set = this.f177438b;
                                String str = dVar.mvResUnzipPath;
                                C89219l.m154716b(str, "");
                                set.add(str);
                                Set set2 = this.f177438b;
                                String str2 = dVar.videoCoverImgPath;
                                C89219l.m154716b(str2, "");
                                set2.add(str2);
                                Set set3 = this.f177438b;
                                ArrayList<String> arrayList = dVar.selectMediaList;
                                C89219l.m154716b(arrayList, "");
                                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
                                Iterator<T> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(it.next().toString());
                                }
                                set3.addAll(arrayList2);
                                ArrayList<MvNetFileBean> arrayList3 = dVar.newMaskFileData;
                                C89219l.m154716b(arrayList3, "");
                                Iterator<T> it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    this.f177438b.add(it2.next().getFilePath());
                                }
                            }
                        }
                        File file = new File(C78948b.m137768b("resize_bitmap_tmp"));
                        File file2 = new File(C78948b.m137768b("cover_tmp"));
                        File file3 = new File(C78948b.m137768b("mvres"));
                        File file4 = new File(C78948b.m137768b("origin_resize_file"));
                        AbstractC78940b.m137736a(file3.listFiles(), this.f177438b);
                        AbstractC78940b.m137738b(file.listFiles(), this.f177438b);
                        AbstractC78940b.m137738b(file2.listFiles(), this.f177438b);
                        AbstractC78940b.m137738b(file4.listFiles(), this.f177438b);
                        return C89391z.f203057a;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f177436a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: a */
                public final Intent mo101652a(CutSameEditData cutSameEditData) {
                    C89219l.m154721d(cutSameEditData, "");
                    return this.f177436a.f177435a.mo122742a(cutSameEditData);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: b */
                public final void mo101659b(ActivityC0945e eVar) {
                    C89219l.m154721d(eVar, "");
                    new C78839a(eVar).mo122691a((C78899d) null, (String) null, "slideshoweffect", false, (AbstractC78853c) new C78839a.C78845e(new C78857a())).mo122701a(null);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: c */
                public final void mo101662c(ActivityC0945e eVar) {
                    C89219l.m154721d(eVar, "");
                    C78839a aVar = new C78839a(eVar);
                    C78857a aVar2 = new C78857a();
                    aVar.mo122691a((C78899d) null, (String) null, "singlepiceffect", false, (AbstractC78853c) new C78839a.C78846f(aVar2)).mo122701a(null);
                    aVar.mo122691a((C78899d) null, (String) null, "slideshoweffect", false, (AbstractC78853c) new C78839a.C78847g(aVar2)).mo122701a(null);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: a */
                public final void mo101654a(ActivityC0945e eVar) {
                    C89219l.m154721d(eVar, "");
                    new C78839a(eVar).mo122691a((C78899d) null, (String) null, "singlepiceffect", false, (AbstractC78853c) new C78839a.C78848h(new C78857a())).mo122701a(null);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: b */
                public final void mo101660b(C43223c cVar) {
                    C89219l.m154721d(cVar, "");
                    if (cVar != null && cVar.f100900W.f100753M != null) {
                        ArrayList<String> arrayList = cVar.f100900W.f100753M.photoToSave;
                        String str = cVar.f100900W.f100753M.mvAutoSaveToast;
                        if (!C84904k.m145909a(arrayList) && !TextUtils.isEmpty(str)) {
                            new C79459a(C63238c.f143574a).mo123052a(str).mo123053a();
                            C1731i.m5640b(new CallableC78949c(arrayList), C1731i.f5562a).mo5534a(C78950d.f177444a, C1731i.f5562a, null);
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: a */
                public final void mo101657a(C43223c cVar) {
                    C89219l.m154721d(cVar, "");
                    if (cVar != null && cVar.f100900W.f100753M != null) {
                        C1731i.m5640b(new CallableC78951e(cVar), C1731i.f5562a);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: a */
                public final void mo101656a(ActivityC0945e eVar, String str, String str2) {
                    String str3 = "";
                    C89219l.m154721d(eVar, str3);
                    C78839a aVar = new C78839a(eVar);
                    C78857a aVar2 = new C78857a();
                    if (str2 != null) {
                        str3 = str2;
                    }
                    aVar.mo122691a((C78899d) null, str, str3, false, (AbstractC78853c) new C78839a.C78849i(str2, aVar2)).mo122701a(null);
                }

                @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at.AbstractC63195a
                /* renamed from: a */
                public final void mo101655a(ActivityC0945e eVar, MusicModel musicModel, IServiceMusicResDownListener iServiceMusicResDownListener, String str) {
                    C89219l.m154721d(eVar, "");
                    new C78839a(eVar).mo122689a((C78899d) null, musicModel, new C78944b(iServiceMusicResDownListener), (List<String>) null, str).mo122701a(null);
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63194at
    /* renamed from: a */
    public final AbstractC63194at.AbstractC63195a mo101651a() {
        return (AbstractC63194at.AbstractC63195a) this.f177434a.getValue();
    }

    /* renamed from: a */
    private static boolean m137737a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* renamed from: a */
    public static void m137736a(File[] fileArr, Set<String> set) {
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                if (file.exists()) {
                    String absolutePath = file.getAbsolutePath();
                    C89219l.m154716b(absolutePath, "");
                    if (absolutePath.length() == 0) {
                        return;
                    }
                    if (file.isDirectory() && !set.contains(absolutePath)) {
                        C80720e.m139938e(absolutePath);
                        m137737a(file);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m137738b(File[] fileArr, Set<String> set) {
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                if (file.exists()) {
                    String absolutePath = file.getAbsolutePath();
                    C89219l.m154716b(absolutePath, "");
                    if (absolutePath.length() == 0) {
                        return;
                    }
                    if (file.isFile() && !set.contains(absolutePath)) {
                        C80720e.m139931c(absolutePath);
                    }
                }
            }
        }
    }
}
