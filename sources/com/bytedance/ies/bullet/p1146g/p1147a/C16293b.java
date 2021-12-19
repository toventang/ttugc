package com.bytedance.ies.bullet.p1146g.p1147a;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14894c;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1012b.p1013a.C14877a;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14963a;
import com.bytedance.geckox.statistic.AbstractC15017a;
import com.bytedance.geckox.utils.C15062l;
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.ies.bullet.kit.p1148a.AbstractC16340d;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16311d;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.service.base.C16630d;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16663f;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.g.a.b */
public final class C16293b implements AbstractC16340d {

    /* renamed from: b */
    public static final C16294a f39134b = new C16294a((byte) 0);

    /* renamed from: a */
    IResourceLoaderService f39135a;

    /* renamed from: c */
    private final C16292a f39136c = new C16292a();

    /* renamed from: d */
    private File f39137d;

    /* renamed from: e */
    private final AbstractC15017a f39138e = C16296c.f39143a;

    static {
        Covode.recordClassIndex(18586);
    }

    @Override // com.bytedance.ies.bullet.kit.p1148a.AbstractC16340d
    /* renamed from: a */
    public final String mo25881a() {
        return "2.4.1-rc.9.2-bugfix";
    }

    /* renamed from: com.bytedance.ies.bullet.g.a.b$a */
    public static final class C16294a {
        static {
            Covode.recordClassIndex(18587);
        }

        private C16294a() {
        }

        public /* synthetic */ C16294a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
    /* renamed from: a */
    public final void mo25883a(IResourceLoaderService iResourceLoaderService) {
        this.f39135a = iResourceLoaderService;
    }

    /* renamed from: com.bytedance.ies.bullet.g.a.b$b */
    public static final class C16295b extends AbstractC14933a {

        /* renamed from: a */
        final /* synthetic */ C16293b f39139a;

        /* renamed from: b */
        final /* synthetic */ C16667j f39140b;

        /* renamed from: c */
        final /* synthetic */ AbstractC16663f f39141c;

        /* renamed from: d */
        final /* synthetic */ List f39142d;

        static {
            Covode.recordClassIndex(18588);
        }

        /* renamed from: b */
        private final String m30299b(String str) {
            return this.f39139a.mo25886b(C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39139a.f39135a), this.f39140b.f39857y).getOfflineDir(), this.f39140b.f39857y, str);
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24044a(LocalPackageModel localPackageModel) {
            String str;
            super.mo24044a(localPackageModel);
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                List<String> list = this.f39142d;
                if (localPackageModel == null || (str = localPackageModel.getChannel()) == null) {
                    str = this.f39140b.f39844l;
                }
                m30299b(str);
                fVar.mo25900a(list);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: b */
        public final void mo24055b(UpdatePackage updatePackage, Throwable th) {
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                List<String> list = this.f39142d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo25901a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24048a(UpdatePackage updatePackage, Throwable th) {
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                List<String> list = this.f39142d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo25901a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24050a(String str, long j) {
            C89219l.m154719c(str, "");
            m30299b(str);
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                fVar.mo25900a(this.f39142d);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24051a(String str, Throwable th) {
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                List<String> list = this.f39142d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo25901a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24052a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                List<String> list = this.f39142d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.mo25901a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24053a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
            boolean z;
            List<Pair<String, Long>> list;
            super.mo24053a(map, map2);
            if (map2 == null || map2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List list2 = this.f39142d;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!(map == null || (list = map.get(this.f39140b.f39857y)) == null)) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (C89219l.m154714a(obj, ((Pair) next).first)) {
                                if (next != null) {
                                }
                            }
                        }
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    AbstractC16663f fVar = this.f39141c;
                    if (fVar != null) {
                        fVar.mo25901a(this.f39142d, new Throwable("invalid channel"));
                    }
                }
                return;
            }
            List list3 = this.f39142d;
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                List<UpdatePackage> list4 = map2.get(this.f39140b.f39857y);
                if (list4 != null) {
                    Iterator<T> it3 = list4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next2 = it3.next();
                        if (C89219l.m154714a((Object) next2.getChannel(), obj2)) {
                            if (next2 != null) {
                            }
                        }
                    }
                }
                arrayList2.add(obj2);
            }
            for (String str : arrayList2) {
                AbstractC16663f fVar2 = this.f39141c;
                if (fVar2 != null) {
                    List<String> list5 = this.f39142d;
                    m30299b(str);
                    fVar2.mo25900a(list5);
                }
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24043a(int i, Map<String, List<Pair<String, Long>>> map, Throwable th) {
            super.mo24043a(i, map, th);
            AbstractC16663f fVar = this.f39141c;
            if (fVar != null) {
                List<String> list = this.f39142d;
                if (th == null) {
                    th = new Throwable("geckox request intercept");
                }
                fVar.mo25901a(list, th);
            }
        }

        C16295b(C16293b bVar, C16667j jVar, AbstractC16663f fVar, List list) {
            this.f39139a = bVar;
            this.f39140b = jVar;
            this.f39141c = fVar;
            this.f39142d = list;
        }
    }

    /* renamed from: a */
    private final C14894c m30285a(C16667j jVar) {
        String str;
        String str2;
        MethodCollector.m26663i(13929);
        String str3 = jVar.f39857y;
        C16292a aVar = this.f39136c;
        IResourceLoaderService iResourceLoaderService = this.f39135a;
        if (iResourceLoaderService == null || (str = iResourceLoaderService.mo26329c()) == null) {
            str = "";
        }
        C14894c a = aVar.mo25878a(str3, str);
        if (a == null) {
            a = m30288b(jVar);
            C16292a aVar2 = this.f39136c;
            IResourceLoaderService iResourceLoaderService2 = this.f39135a;
            if (iResourceLoaderService2 == null || (str2 = iResourceLoaderService2.mo26329c()) == null) {
                str2 = "";
            }
            C89219l.m154719c(str3, "");
            C89219l.m154719c(str2, "");
            synchronized (aVar2.f39133a) {
                try {
                    Map<String, C14894c> map = aVar2.f39133a.get(str2);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                    }
                    map.put(str3, a);
                    aVar2.f39133a.put(str2, map);
                } finally {
                    MethodCollector.m26664o(13929);
                }
            }
        }
        return a;
    }

    /* renamed from: b */
    private final C14894c m30288b(C16667j jVar) {
        String str;
        AbstractC14965c aVar;
        C14877a aVar2;
        C16666i a = C16343g.C16345b.f39286a.mo25918a(this.f39135a);
        Application application = C16343g.C16345b.f39286a.f39284b;
        if (a.f39833l.length() == 0) {
            str = "000";
        } else {
            str = a.f39833l;
        }
        String str2 = jVar.f39857y;
        File a2 = m30286a(C16326f.m30330a(a, str2).getOfflineDir(), C16326f.m30330a(a, str2).isRelativePath());
        Object networkImpl = C16326f.m30330a(a, str2).getNetworkImpl();
        if (networkImpl == null) {
            networkImpl = a.f39838q;
        }
        if (networkImpl instanceof AbstractC14965c) {
            aVar = (AbstractC14965c) networkImpl;
        } else {
            aVar = new C14963a();
        }
        AbstractC16584o oVar = jVar.f39851s;
        if (oVar != null) {
            aVar2 = (C14877a) oVar.mo25789a_(C14877a.class);
        } else {
            aVar2 = null;
        }
        try {
            if (application == null) {
                C89219l.m154707a();
            }
            Context applicationContext = application.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            C14905e.C14906a aVar3 = new C14905e.C14906a(applicationContext);
            aVar3.f36429k = a.f39828g;
            C14905e.C14906a a3 = aVar3.mo24005a(Long.parseLong(a.f39831j));
            a3.f36427i = a.f39832k;
            a3.f36419a = aVar;
            a3.f36425g = aVar2;
            a3.f36424f = this.f39138e;
            C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39135a), jVar.f39857y).getServerMonitor();
            a3.f36431m = a.f39829h;
            C14905e.C14906a a4 = a3.mo24014b(str2).mo24012a(str2);
            a4.f36428j = str;
            a4.f36433o = C16326f.m30330a(a, str2).getLoopCheck();
            a4.f36430l = a2;
            if (aVar2 != null) {
                a4.f36425g = aVar2;
            }
            return C14894c.m27397a(a4.mo24015b());
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.g.a.b$c */
    static final class C16296c implements AbstractC15017a {

        /* renamed from: a */
        public static final C16296c f39143a = new C16296c();

        static {
            Covode.recordClassIndex(18589);
        }

        C16296c() {
        }

        @Override // com.bytedance.geckox.statistic.AbstractC15017a
        /* renamed from: a */
        public final void mo24302a(String str, JSONObject jSONObject) {
            TextUtils.isEmpty(str);
        }
    }

    /* renamed from: a */
    private final File m30286a(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.f39137d == null) {
            Application application = C16343g.C16345b.f39286a.f39284b;
            if (application == null) {
                C89219l.m154707a();
            }
            this.f39137d = application.getFilesDir();
        }
        try {
            File file = new File(this.f39137d, str);
            if (file.exists()) {
                return file;
            }
            file.mkdirs();
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    /* renamed from: b */
    private static C16630d m30289b(String str, String str2) {
        String str3 = "";
        C16630d dVar = new C16630d(str3, str3);
        if (C16326f.m30334a(str) && C16326f.m30334a(str2)) {
            try {
                Pattern compile = Pattern.compile(str2 + "/(([^/]+)/([^?]*))");
                if (str == null) {
                    str = str3;
                }
                Matcher matcher = compile.matcher(str);
                if (matcher.find() && matcher.groupCount() == 3) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(3);
                    if (C16326f.m30334a(group) && C16326f.m30334a(group2)) {
                        if (group == null) {
                            group = str3;
                        }
                        dVar.mo26390a(group);
                        if (group2 != null) {
                            str3 = group2;
                        }
                        dVar.mo26392b(str3);
                        dVar.f39788c = true;
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        if (r8 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0200, code lost:
        if (r1 != null) goto L_0x0202;
     */
    @Override // com.bytedance.ies.bullet.kit.p1148a.AbstractC16340d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j mo25880a(android.net.Uri r13, com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j r14) {
        /*
        // Method dump skipped, instructions count: 555
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p1146g.p1147a.C16293b.mo25880a(android.net.Uri, com.bytedance.ies.bullet.service.base.resourceloader.config.j):com.bytedance.ies.bullet.service.base.resourceloader.config.j");
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
    /* renamed from: a */
    public final Map<String, String> mo25882a(String str, String str2) {
        File[] listFiles;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        File a = m30286a(str, C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39135a), str2).isRelativePath());
        File file = new File(a, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                C89219l.m154709a((Object) file2, "");
                if (file2.isDirectory()) {
                    String absolutePath = a.getAbsolutePath();
                    C89219l.m154709a((Object) absolutePath, "");
                    String name = file2.getName();
                    C89219l.m154709a((Object) name, "");
                    Long c = m30290c(absolutePath, str2, name);
                    if (c != null && c.longValue() > 0) {
                        File file3 = new File(file2.getAbsolutePath() + File.separator + c + File.separator + "res" + File.separator + "preload.json");
                        if (file3.exists() && file3.canRead()) {
                            String name2 = file2.getName();
                            C89219l.m154709a((Object) name2, "");
                            String absolutePath2 = file3.getAbsolutePath();
                            C89219l.m154709a((Object) absolutePath2, "");
                            linkedHashMap.put(name2, absolutePath2);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    private static Long m30290c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            String absolutePath = file.getAbsolutePath();
            C89219l.m154709a((Object) absolutePath, "");
            File file2 = new File(absolutePath, str3);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return C15064m.m27738a(file2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
    /* renamed from: a_ */
    public final boolean mo25885a_(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || m30287a(m30286a(str, C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39135a), str2).isRelativePath()), str2, str3) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m30287a(File file, String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        if (C89361p.m154888a((CharSequence) str2, "/", 0, false, 6) == 0) {
            if (str2 != null) {
                str2 = str2.substring(1);
                C89219l.m154709a((Object) str2, "");
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        if (C89361p.m154885a((CharSequence) str2, "/") == str2.length() - 1) {
            str2 = str2.substring(0, C89361p.m154885a((CharSequence) str2, "/"));
            C89219l.m154709a((Object) str2, "");
        }
        try {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String absolutePath = file2.getAbsolutePath();
            C89219l.m154709a((Object) absolutePath, "");
            File file3 = new File(absolutePath, str2);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            return C15062l.m27732a(file, str, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.p1148a.AbstractC16340d
    /* renamed from: a */
    public final long mo25879a(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String absolutePath = m30286a(str, C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39135a), str2).isRelativePath()).getAbsolutePath();
            C89219l.m154709a((Object) absolutePath, "");
            Long c = m30290c(absolutePath, str2, str3);
            if (c != null) {
                return c.longValue();
            }
        }
        return 0;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
    /* renamed from: b */
    public final String mo25886b(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        boolean z3 = true;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (C89361p.m154888a((CharSequence) str3, "/", 0, false, 6) != 0) {
                    return m30287a(m30286a(str, C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39135a), str2).isRelativePath()), str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                Object[] array = new C89350l("/").split(str3, 0).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length <= 1) {
                        return null;
                    }
                    String str4 = strArr[1];
                    int length = strArr.length;
                    for (int i = 2; i < length; i++) {
                        sb.append(File.separator).append(strArr[i]);
                    }
                    if (TextUtils.isEmpty(str4)) {
                        return null;
                    }
                    try {
                        File a = m30286a(str, C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(this.f39135a), str2).isRelativePath());
                        if (!a.exists()) {
                            a.mkdirs();
                        }
                        String absolutePath = new File(a, str2).getAbsolutePath();
                        C89219l.m154709a((Object) absolutePath, "");
                        File file = new File(absolutePath, str4);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String a2 = C15062l.m27732a(a, str2, str4);
                        if (sb.length() <= 0) {
                            z3 = false;
                        }
                        if (z3) {
                            a2 = a2 + sb.toString();
                        }
                        return a2;
                    } catch (Throwable unused) {
                        return null;
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.AbstractC16661d
    /* renamed from: a */
    public final void mo25884a(C16667j jVar, List<String> list, AbstractC16663f fVar) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(list, "");
        C16295b bVar = new C16295b(this, jVar, fVar, list);
        C14894c a = m30285a(jVar);
        if (a != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel(list.get(0)));
            hashMap.put(jVar.f39857y, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            String str = jVar.f39857y;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C16666i a2 = C16343g.C16345b.f39286a.mo25918a(this.f39135a);
            String businessVersion = C16326f.m30330a(a2, str).getBusinessVersion();
            if (businessVersion == null) {
                businessVersion = a2.f39832k;
            }
            linkedHashMap2.put("business_version", businessVersion);
            linkedHashMap.put(str, linkedHashMap2);
            OptionCheckUpdateParams listener = optionCheckUpdateParams.setCustomParam(linkedHashMap).setListener(bVar);
            if (jVar instanceof C16311d) {
                if (((C16311d) jVar).f39182f == 1) {
                    C89219l.m154709a((Object) listener, "");
                    listener.setChannelUpdatePriority(3);
                    listener.setEnableThrottle(false);
                } else {
                    C89219l.m154709a((Object) listener, "");
                    listener.setLazyUpdate(true);
                }
            }
            C89219l.m154709a((Object) listener, "");
            a.mo23998a((String) null, hashMap, listener);
        } else if (fVar != null) {
            fVar.mo25901a(list, new Throwable("GeckoXClient is null"));
        }
    }
}
