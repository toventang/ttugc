package dmt.p4542av.video.p4544a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63275c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65398ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: dmt.av.video.a.a */
public final class C88152a {

    /* renamed from: a */
    static final AbstractC89244h f200101a = C89250i.m154773a((AbstractC89171a) C88157c.f200110a);

    /* renamed from: b */
    public static final C88152a f200102b = new C88152a();

    /* renamed from: c */
    private static final AbstractC89244h f200103c = C89250i.m154773a((AbstractC89171a) C88153a.f200104a);

    /* renamed from: a */
    public static AbstractC40389c m153231a() {
        return (AbstractC40389c) f200103c.getValue();
    }

    private C88152a() {
    }

    /* renamed from: dmt.av.video.a.a$a */
    static final class C88153a extends AbstractC89220m implements AbstractC89171a<AbstractC40389c> {

        /* renamed from: a */
        public static final C88153a f200104a = new C88153a();

        static {
            Covode.recordClassIndex(104188);
        }

        C88153a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC40389c invoke() {
            return C63244g.m114602a().mo73279g().mo69470c();
        }
    }

    /* renamed from: dmt.av.video.a.a$c */
    static final class C88157c extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C88157c f200110a = new C88157c();

        static {
            Covode.recordClassIndex(104192);
        }

        C88157c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(m153235a());
        }

        /* renamed from: a */
        private static long m153235a() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                return ((long) iESSettingsProxy.getLocalVideoCacheMaxAge().intValue()) * 60000;
            } catch (C16041a unused) {
                return 259200000;
            }
        }
    }

    static {
        Covode.recordClassIndex(104187);
    }

    /* renamed from: a */
    public static final void m153232a(String str) {
        C89219l.m154721d(str, "");
        if (C65398ck.m117098a()) {
            m153233b(str);
        }
    }

    /* renamed from: b */
    private static void m153233b(String str) {
        C84911q.m145928d("CleanRecordIntermediateFileUtils: scene = ".concat(String.valueOf(str)));
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new C88154b(str, null), 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.av.video.a.a$b */
    public static final class C88154b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f200105a;

        /* renamed from: b */
        final /* synthetic */ String f200106b;

        static {
            Covode.recordClassIndex(104189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88154b(String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f200106b = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C88154b(this.f200106b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C88154b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* renamed from: a */
        private static boolean m153234a(File file) {
            MethodCollector.m26663i(9959);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(9959);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(9959);
            return delete;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            if (this.f200105a == 0) {
                C89382r.m154942a(obj);
                final long currentTimeMillis = System.currentTimeMillis();
                List<C43223c> queryAllDraftList = AVServiceImpl.m113116a().draftService().queryAllDraftList(false);
                C89219l.m154716b(queryAllDraftList, "");
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) queryAllDraftList, 10));
                for (T t : queryAllDraftList) {
                    AbstractC63275c c = C63244g.m114602a().mo73275c();
                    C89219l.m154716b(t, "");
                    String draftDir = c.mo101849b(t, "CleanRecordIntermediateFileUtils").draftDir();
                    EditPreviewInfo h = C43225d.m86338h(t);
                    if (h != null) {
                        List<EditVideoSegment> videoList = h.getVideoList();
                        if (videoList != null) {
                            ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) videoList, 10));
                            Iterator<T> it = videoList.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(it.next().getVideoPath());
                            }
                            arrayList = arrayList4;
                            ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) videoList, 10));
                            Iterator<T> it2 = videoList.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(it2.next().getAudioPath());
                            }
                            arrayList2 = arrayList5;
                            C89219l.m154716b(draftDir, "");
                            C88158b bVar = new C88158b(arrayList, arrayList2, draftDir);
                            C84911q.m145928d("CleanRecordIntermediateFileUtils:item: " + bVar.toString());
                            arrayList3.add(bVar);
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    C89219l.m154716b(draftDir, "");
                    C88158b bVar2 = new C88158b(arrayList, arrayList2, draftDir);
                    C84911q.m145928d("CleanRecordIntermediateFileUtils:item: " + bVar2.toString());
                    arrayList3.add(bVar2);
                }
                final ArrayList arrayList6 = arrayList3;
                C84911q.m145928d("CleanRecordIntermediateFileUtils: get draft list size = " + arrayList6.size() + ", elapsedTime = " + (System.currentTimeMillis() - currentTimeMillis));
                AbstractC40389c a = C88152a.m153231a();
                String str = C70638dj.f158101d;
                C89219l.m154716b(str, "");
                File g = a.mo69481g(str);
                C89233z.C89237d dVar = new C89233z.C89237d();
                dVar.element = 0;
                C89233z.C89237d dVar2 = new C89233z.C89237d();
                dVar2.element = 0;
                if (g.exists() && g.isDirectory()) {
                    File[] listFiles = g.listFiles(new FileFilter() {
                        /* class dmt.p4542av.video.p4544a.C88152a.C88154b.C881551 */

                        static {
                            Covode.recordClassIndex(104190);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
                            if (p4600h.p4622m.C89361p.m154876c(r6, "-concat-a", false) == false) goto L_0x0065;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final boolean accept(java.io.File r12) {
                            /*
                            // Method dump skipped, instructions count: 215
                            */
                            throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4544a.C88152a.C88154b.C881551.accept(java.io.File):boolean");
                        }
                    });
                    C89219l.m154716b(listFiles, "");
                    for (File file : listFiles) {
                        long length = file.length();
                        if (m153234a(file)) {
                            dVar.element++;
                            dVar2.element += length;
                            C84911q.m145928d("CleanRecordIntermediateFileUtils: delete file = ".concat(String.valueOf(file)));
                        }
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C84911q.m145928d("CleanRecordIntermediateFileUtils: delete file size = " + dVar.element + ", length = " + dVar2.element + ", elapsedTime = " + currentTimeMillis2);
                AbstractC40389c a2 = C88152a.m153231a();
                String str2 = C70638dj.f158103f;
                C89219l.m154716b(str2, "");
                File g2 = a2.mo69481g(str2);
                C89233z.C89237d dVar3 = new C89233z.C89237d();
                dVar3.element = 0;
                C89233z.C89237d dVar4 = new C89233z.C89237d();
                dVar4.element = 0;
                if (g2.exists() && g2.isDirectory()) {
                    File[] listFiles2 = g2.listFiles(new FileFilter() {
                        /* class dmt.p4542av.video.p4544a.C88152a.C88154b.C881562 */

                        static {
                            Covode.recordClassIndex(104191);
                        }

                        public final boolean accept(File file) {
                            Object obj;
                            File[] listFiles;
                            C89219l.m154716b(file, "");
                            if (file.isDirectory()) {
                                Iterator it = arrayList6.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    String str = ((C88158b) obj).f200113c;
                                    String name = file.getName();
                                    C89219l.m154716b(name, "");
                                    if (C89361p.m154876c(str, name, false)) {
                                        break;
                                    }
                                }
                                if (obj == null && (listFiles = file.listFiles()) != null) {
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    for (File file2 : listFiles) {
                                        C89219l.m154716b(file2, "");
                                        if (C89219l.m154714a((Object) file2.getName(), (Object) "data.txt")) {
                                            z = true;
                                        }
                                        String name2 = file2.getName();
                                        C89219l.m154716b(name2, "");
                                        if (C89361p.m154876c(name2, "_frag_a", false)) {
                                            z2 = true;
                                        }
                                        String name3 = file2.getName();
                                        C89219l.m154716b(name3, "");
                                        if (C89361p.m154876c(name3, "_frag_v", false)) {
                                            z3 = true;
                                        }
                                    }
                                    if ((!z || !z2 || z3) && (listFiles.length != 1 || !z)) {
                                        return false;
                                    }
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    C89219l.m154716b(listFiles2, "");
                    for (File file2 : listFiles2) {
                        C89219l.m154716b(file2, "");
                        long d = C80720e.m139933d(file2.getPath());
                        C80720e.m139925b(file2);
                        dVar3.element++;
                        dVar4.element += d;
                        C43213k.m86181a("[internalCleanInvalidIntermediateFile] : delete draft dir = ".concat(String.valueOf(file2)));
                        C84911q.m145928d("CleanRecordIntermediateFileUtils: delete draft dir = ".concat(String.valueOf(file2)));
                    }
                }
                long currentTimeMillis3 = (System.currentTimeMillis() - currentTimeMillis) - currentTimeMillis2;
                C84911q.m145928d("CleanRecordIntermediateFileUtils: delete dir size = " + dVar3.element + ", length = " + dVar4.element + ",  elapsedTime = " + currentTimeMillis3);
                C80322d.m139251a("tool_performance_clean_record_intermediate_file", new C84425b().mo129406a("scene", this.f200106b).mo129404a("clean_delete_file_size", dVar.element).mo129404a("clean_delete_file_length", dVar2.element).mo129404a("clean_delete_file_time", currentTimeMillis2).mo129404a("clean_delete_dir_size", dVar3.element).mo129404a("clean_delete_dir_length", dVar4.element).mo129404a("clean_delete_dir_time", currentTimeMillis3).f188764a);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
