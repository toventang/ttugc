package com.bytedance.lynx.hybrid.resource.p1531g.p1533b;

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
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import com.bytedance.lynx.hybrid.resource.AbstractC21323h;
import com.bytedance.lynx.hybrid.resource.C21303f;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21281g;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.p1526b.C21248d;
import com.bytedance.lynx.hybrid.resource.p1526b.C21263f;
import com.bytedance.lynx.hybrid.resource.p1528d.C21290a;
import com.bytedance.lynx.hybrid.service.IResourceService;
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

/* renamed from: com.bytedance.lynx.hybrid.resource.g.b.b */
public final class C21319b implements AbstractC21323h {

    /* renamed from: b */
    public static final C21320a f50628b = new C21320a((byte) 0);

    /* renamed from: a */
    IResourceService f50629a;

    /* renamed from: c */
    private final C21318a f50630c = new C21318a();

    /* renamed from: d */
    private File f50631d;

    /* renamed from: e */
    private final AbstractC15017a f50632e = C21322c.f50637a;

    static {
        Covode.recordClassIndex(24937);
    }

    @Override // com.bytedance.lynx.hybrid.resource.AbstractC21323h
    /* renamed from: a */
    public final String mo34928a() {
        return "2.3.2";
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.b.b$a */
    public static final class C21320a {
        static {
            Covode.recordClassIndex(24938);
        }

        private C21320a() {
        }

        public /* synthetic */ C21320a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
    /* renamed from: a */
    public final void mo34883a(IResourceService iResourceService) {
        this.f50629a = iResourceService;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.b.b$b */
    public static final class C21321b extends AbstractC14933a {

        /* renamed from: a */
        final /* synthetic */ C21319b f50633a;

        /* renamed from: b */
        final /* synthetic */ C21284j f50634b;

        /* renamed from: c */
        final /* synthetic */ AbstractC21281g f50635c;

        /* renamed from: d */
        final /* synthetic */ List f50636d;

        static {
            Covode.recordClassIndex(24939);
        }

        /* renamed from: b */
        private final String m40048b(String str) {
            return this.f50633a.mo34885b(C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50633a.f50629a), this.f50634b.f50529t).getOfflineDir(), this.f50634b.f50529t, str);
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24044a(LocalPackageModel localPackageModel) {
            String str;
            super.mo24044a(localPackageModel);
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                List<String> list = this.f50636d;
                if (localPackageModel == null || (str = localPackageModel.getChannel()) == null) {
                    str = this.f50634b.f50516g;
                }
                m40048b(str);
                gVar.mo34843a(list);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: b */
        public final void mo24055b(UpdatePackage updatePackage, Throwable th) {
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                List<String> list = this.f50636d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.mo34844a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24048a(UpdatePackage updatePackage, Throwable th) {
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                List<String> list = this.f50636d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.mo34844a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24050a(String str, long j) {
            C89219l.m154719c(str, "");
            C21210c.m39924a("onUpdateSuccess", EnumC21209b.I, "GeckoXResLoadStrategy");
            m40048b(str);
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                gVar.mo34843a(this.f50636d);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24051a(String str, Throwable th) {
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                List<String> list = this.f50636d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.mo34844a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24052a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                List<String> list = this.f50636d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.mo34844a(list, th);
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24053a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
            List<UpdatePackage> list;
            super.mo24053a(map, map2);
            List list2 = this.f50636d;
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : list2) {
                if (map2 != null && (list = map2.get(this.f50634b.f50529t)) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) next.getChannel(), obj)) {
                            if (next != null) {
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
            for (String str : arrayList) {
                AbstractC21281g gVar = this.f50635c;
                if (gVar != null) {
                    List<String> list3 = this.f50636d;
                    m40048b(str);
                    gVar.mo34843a(list3);
                }
            }
        }

        @Override // com.bytedance.geckox.p1019f.AbstractC14933a
        /* renamed from: a */
        public final void mo24043a(int i, Map<String, List<Pair<String, Long>>> map, Throwable th) {
            super.mo24043a(i, map, th);
            AbstractC21281g gVar = this.f50635c;
            if (gVar != null) {
                List<String> list = this.f50636d;
                if (th == null) {
                    th = new Throwable("geckox request intercept");
                }
                gVar.mo34844a(list, th);
            }
        }

        C21321b(C21319b bVar, C21284j jVar, AbstractC21281g gVar, List list) {
            this.f50633a = bVar;
            this.f50634b = jVar;
            this.f50635c = gVar;
            this.f50636d = list;
        }
    }

    /* renamed from: a */
    private final C14894c m40034a(C21284j jVar) {
        String str;
        String str2;
        MethodCollector.m26663i(3265);
        String str3 = jVar.f50529t;
        C21318a aVar = this.f50630c;
        IResourceService iResourceService = this.f50629a;
        if (iResourceService == null || (str = iResourceService.mo34953b()) == null) {
            str = "";
        }
        C14894c a = aVar.mo34926a(str3, str);
        if (a == null) {
            a = m40037b(jVar);
            C21318a aVar2 = this.f50630c;
            IResourceService iResourceService2 = this.f50629a;
            if (iResourceService2 == null || (str2 = iResourceService2.mo34953b()) == null) {
                str2 = "";
            }
            C89219l.m154719c(str3, "");
            C89219l.m154719c(str2, "");
            synchronized (aVar2.f50627a) {
                try {
                    Map<String, C14894c> map = aVar2.f50627a.get(str2);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                    }
                    map.put(str3, a);
                    aVar2.f50627a.put(str2, map);
                } finally {
                    MethodCollector.m26664o(3265);
                }
            }
        }
        return a;
    }

    /* renamed from: b */
    private final C14894c m40037b(C21284j jVar) {
        String c;
        AbstractC14965c aVar;
        C14877a aVar2;
        long j;
        C21277c a = C21303f.C21305b.f50578a.mo34909a(this.f50629a);
        Application application = C21303f.C21305b.f50578a.f50576b;
        if (C21277c.m39981c().length() == 0) {
            c = "000";
        } else {
            c = C21277c.m39981c();
        }
        String str = jVar.f50529t;
        File a2 = m40035a(C21263f.m39966a(a, str).getOfflineDir(), C21263f.m39966a(a, str).isRelativePath());
        Object networkImpl = C21263f.m39966a(a, str).getNetworkImpl();
        if (networkImpl == null) {
            networkImpl = a.f50506m;
        }
        if (networkImpl instanceof AbstractC14965c) {
            aVar = (AbstractC14965c) networkImpl;
        } else {
            aVar = new C14963a();
        }
        C21196a aVar3 = jVar.f50523n;
        if (aVar3 != null) {
            aVar2 = (C14877a) aVar3.mo34746a(C14877a.class);
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
            C14905e.C14906a c2 = new C14905e.C14906a(applicationContext).mo24016c(a.f50501h);
            String a3 = C21277c.m39979a();
            if (a3.length() <= 0 || a3 == null) {
                j = 0;
            } else {
                j = Long.parseLong(a3);
            }
            C14905e.C14906a a4 = c2.mo24005a(j).mo24010a(C21277c.m39980b()).mo24007a(aVar).mo24006a(aVar2).mo24008a(this.f50632e);
            C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), jVar.f50529t).getServerMonitor();
            C14905e.C14906a a5 = a4.mo24004a().mo24017d(C21277c.m39982d()).mo24014b(str).mo24012a(str).mo24013b(c).mo24011a(C21263f.m39966a(a, str).getLoopCheck()).mo24009a(a2);
            if (aVar2 != null) {
                a5.mo24006a(aVar2);
            }
            return C14894c.m27397a(a5.mo24015b());
        } catch (Exception e) {
            C21210c.m39924a("registerGeckoClientSpi: " + Log.getStackTraceString(e), EnumC21209b.E, "Gecko");
            return null;
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.b.b$c */
    static final class C21322c implements AbstractC15017a {

        /* renamed from: a */
        public static final C21322c f50637a = new C21322c();

        static {
            Covode.recordClassIndex(24940);
        }

        C21322c() {
        }

        @Override // com.bytedance.geckox.statistic.AbstractC15017a
        /* renamed from: a */
        public final void mo24302a(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str) && jSONObject != null) {
                C21210c.m39924a("event:" + str + ",data:" + jSONObject, EnumC21209b.D, "GeckoXDepender");
            }
        }
    }

    /* renamed from: a */
    private final File m40035a(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.f50631d == null) {
            Application application = C21303f.C21305b.f50578a.f50576b;
            if (application == null) {
                C89219l.m154707a();
            }
            this.f50631d = application.getFilesDir();
        }
        try {
            File file = new File(this.f50631d, str);
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
    private static C21290a m40038b(String str, String str2) {
        C21290a aVar = new C21290a("", "", false);
        if (C21263f.m39968a(str) && C21263f.m39968a(str2)) {
            try {
                Pattern compile = Pattern.compile(str2 + "/(([^/]+)/([^?]*))");
                if (str == null) {
                    str = "";
                }
                Matcher matcher = compile.matcher(str);
                if (matcher.find() && matcher.groupCount() == 3) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(3);
                    if (C21263f.m39968a(group) && C21263f.m39968a(group2)) {
                        if (group == null) {
                            group = "";
                        }
                        C89219l.m154719c(group, "");
                        aVar.f50535a = group;
                        if (group2 == null) {
                            group2 = "";
                        }
                        C89219l.m154719c(group2, "");
                        aVar.f50536b = group2;
                        aVar.f50537c = true;
                    }
                }
            } catch (Exception e) {
                C21210c.m39924a("ChannelBundleModel parse error: " + e.getMessage(), EnumC21209b.W, "GeckoXDepender");
            }
        }
        return aVar;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
    /* renamed from: a */
    public final Map<String, String> mo34881a(String str, String str2) {
        File[] listFiles;
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        File a = m40035a(str, C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), str2).isRelativePath());
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
                    Long d = m40039d(absolutePath, str2, name);
                    if (d != null && d.longValue() > 0) {
                        File file3 = new File(file2.getAbsolutePath() + File.separator + d + File.separator + "res" + File.separator + "preload.json");
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

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        if (r1 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        if (r1 != null) goto L_0x01d8;
     */
    @Override // com.bytedance.lynx.hybrid.resource.AbstractC21323h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.lynx.hybrid.resource.config.C21284j mo34927a(android.net.Uri r13, com.bytedance.lynx.hybrid.resource.config.C21284j r14) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.p1531g.p1533b.C21319b.mo34927a(android.net.Uri, com.bytedance.lynx.hybrid.resource.config.j):com.bytedance.lynx.hybrid.resource.config.j");
    }

    @Override // com.bytedance.lynx.hybrid.resource.AbstractC21323h
    /* renamed from: c */
    public final long mo34929c(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String absolutePath = m40035a(str, C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), str2).isRelativePath()).getAbsolutePath();
            C89219l.m154709a((Object) absolutePath, "");
            Long d = m40039d(absolutePath, str2, str3);
            if (d != null) {
                return d.longValue();
            }
        }
        return 0;
    }

    /* renamed from: d */
    private static Long m40039d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        C21210c.m39924a("getLatestChannelVersion:rootdir:" + str + ",accessKey:" + str2 + ",channel:" + str3, EnumC21209b.D, "GeckoXDepender");
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
            Long a = C15064m.m27738a(file2);
            C21210c.m39924a("getLatestChannelVersion:".concat(String.valueOf(a)), EnumC21209b.D, "GeckoXDepender");
            return a;
        } catch (Throwable unused) {
            C21210c.m39924a("getLatestChannelVersion:error", EnumC21209b.D, "GeckoXDepender");
            return null;
        }
    }

    /* renamed from: a */
    private static String m40036a(File file, String str, String str2) {
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
            Long a = C15064m.m27738a(file3);
            if (a == null) {
                return null;
            }
            String str3 = absolutePath + File.separator + str2 + File.separator + a.longValue() + File.separator + "res";
            C21210c.m39924a("getChannelPath:".concat(String.valueOf(str3)), EnumC21209b.D, "GeckoXDepender");
            return str3;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
    /* renamed from: b */
    public final String mo34885b(String str, String str2, String str3) {
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
                    return m40036a(m40035a(str, C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), str2).isRelativePath()), str2, str3);
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
                        File file = new File(m40035a(str, C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), str2).isRelativePath()), str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String absolutePath = file.getAbsolutePath();
                        C89219l.m154709a((Object) absolutePath, "");
                        File file2 = new File(absolutePath, str4);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        Long a = C15064m.m27738a(file2);
                        if (a == null) {
                            return null;
                        }
                        String str5 = absolutePath + File.separator + str4 + File.separator + a.longValue() + File.separator + "res";
                        if (sb.length() <= 0) {
                            z3 = false;
                        }
                        if (z3) {
                            str5 = str5 + sb.toString();
                        }
                        C21210c.m39924a("getRnResPath:".concat(String.valueOf(str5)), EnumC21209b.D, "GeckoXDepender");
                        return str5;
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

    @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
    /* renamed from: a */
    public final void mo34882a(C21284j jVar, List<String> list, AbstractC21281g gVar) {
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(list, "");
        C21321b bVar = new C21321b(this, jVar, gVar, list);
        C14894c a = m40034a(jVar);
        if (a != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel(list.get(0)));
            hashMap.put(jVar.f50529t, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            String str = jVar.f50529t;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String businessVersion = C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), str).getBusinessVersion();
            if (businessVersion == null) {
                businessVersion = C21277c.m39980b();
            }
            linkedHashMap2.put("business_version", businessVersion);
            linkedHashMap.put(str, linkedHashMap2);
            OptionCheckUpdateParams listener = optionCheckUpdateParams.setCustomParam(linkedHashMap).setListener(bVar);
            if ((jVar instanceof C21248d) && ((C21248d) jVar).f50430z == 1) {
                C89219l.m154709a((Object) listener, "");
                listener.setChannelUpdatePriority(3);
            }
            C89219l.m154709a((Object) listener, "");
            a.mo23998a((String) null, hashMap, listener);
        } else if (gVar != null) {
            gVar.mo34844a(list, new Throwable("GeckoXClient is null"));
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.AbstractC21279e
    /* renamed from: a */
    public final boolean mo34884a(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String absolutePath = m40035a(str, C21263f.m39966a(C21303f.C21305b.f50578a.mo34909a(this.f50629a), str2).isRelativePath()).getAbsolutePath();
            C89219l.m154709a((Object) absolutePath, "");
            if (m40039d(absolutePath, str2, str3) != null) {
                return true;
            }
        }
        return false;
    }
}
