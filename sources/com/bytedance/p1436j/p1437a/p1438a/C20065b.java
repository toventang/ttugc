package com.bytedance.p1436j.p1437a.p1438a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16658a;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.EnumC16662e;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.j.a.a.b */
public final class C20065b {

    /* renamed from: a */
    public static final C20065b f47755a = new C20065b();

    /* renamed from: b */
    private static C20066c f47756b;

    private C20065b() {
    }

    static {
        Covode.recordClassIndex(23573);
    }

    /* renamed from: a */
    private static String m38022a(String str) {
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        C89219l.m154709a((Object) path, "");
        String uri = path.build().toString();
        C89219l.m154709a((Object) uri, "");
        return uri;
    }

    /* renamed from: a */
    private static String m38023a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return C89361p.m154940j(str, str2);
    }

    /* renamed from: a */
    private static String m38021a(C20064a aVar, String str) {
        T t;
        List<String> list = aVar.f47753f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89361p.m154874b(str, (String) t, false)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    C89219l.m154709a((Object) substring, "");
                    return C89361p.m154896a(substring, '?');
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m38019a(IResourceLoaderService iResourceLoaderService, Uri uri, AbstractC16584o oVar, AbstractC16640d dVar) {
        Uri uri2;
        String queryParameter;
        C16658a aVar;
        C16610ap apVar;
        C20064a aVar2;
        C20064a aVar3;
        MethodCollector.m26663i(11140);
        if (uri != null) {
            if (uri.isHierarchical()) {
                uri2 = uri;
            } else {
                uri2 = null;
            }
            if (!(uri2 == null || (queryParameter = uri2.getQueryParameter("groupId")) == null)) {
                String queryParameter2 = uri.getQueryParameter("cardId");
                String queryParameter3 = uri.getQueryParameter("gecko_format");
                C16667j jVar = new C16667j();
                jVar.f39851s = oVar;
                String queryParameter4 = uri.getQueryParameter("accessKey");
                if (queryParameter4 != null) {
                    C89219l.m154709a((Object) queryParameter4, "");
                    jVar.mo26456f(queryParameter4);
                }
                jVar.mo26454d("sub_source");
                jVar.f39855w = dVar;
                AbstractC16584o oVar2 = jVar.f39851s;
                if (oVar2 == null || (aVar = (C16658a) oVar2.mo25789a_(C16658a.class)) == null) {
                    aVar = new C16658a(true);
                }
                aVar.mo26448a(C89070n.m154524c(EnumC16662e.GECKO, EnumC16662e.BUILTIN));
                jVar.mo26450a(aVar);
                C20066c cVar = f47756b;
                if (!(cVar == null || queryParameter2 == null || (aVar3 = cVar.f47758b.get(queryParameter2)) == null)) {
                    String uri3 = uri.toString();
                    C89219l.m154709a((Object) uri3, "");
                    String a = m38020a(iResourceLoaderService, aVar3, uri3, queryParameter + "_resource", queryParameter3, jVar);
                    if (a != null) {
                        String uri4 = Uri.fromFile(new File(a)).toString();
                        MethodCollector.m26664o(11140);
                        return uri4;
                    }
                }
                if (iResourceLoaderService != null) {
                    C89219l.m154709a((Object) queryParameter, "");
                    String a2 = m38022a(queryParameter);
                    jVar.mo26451a(queryParameter);
                    jVar.mo26454d("sub_source");
                    apVar = iResourceLoaderService.loadSync(a2, jVar);
                } else {
                    apVar = null;
                }
                if (apVar != null) {
                    File file = new File(apVar.f39755o + File.separator + "config.json");
                    if (!file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            C20066c a3 = C20067d.m38024a(fileInputStream);
                            if (a3 != null) {
                                f47756b = a3;
                                if (!(queryParameter2 == null || (aVar2 = a3.f47758b.get(queryParameter2)) == null)) {
                                    String uri5 = uri.toString();
                                    C89219l.m154709a((Object) uri5, "");
                                    String a4 = m38020a(iResourceLoaderService, aVar2, uri5, queryParameter + "_resource", queryParameter3, jVar);
                                    if (a4 != null) {
                                        String uri6 = Uri.fromFile(new File(a4)).toString();
                                        C89146c.m154636a(fileInputStream, null);
                                        MethodCollector.m26664o(11140);
                                        return uri6;
                                    }
                                }
                            }
                            C89146c.m154636a(fileInputStream, null);
                        } catch (Throwable th) {
                            C89146c.m154636a(fileInputStream, th);
                            MethodCollector.m26664o(11140);
                            throw th;
                        }
                    }
                }
            }
        }
        MethodCollector.m26664o(11140);
        return null;
    }

    /* renamed from: a */
    private static String m38020a(IResourceLoaderService iResourceLoaderService, C20064a aVar, String str, String str2, String str3, C16667j jVar) {
        String a = m38021a(aVar, str);
        if (a != null) {
            String a2 = m38023a(a, str3);
            if (iResourceLoaderService != null) {
                String a3 = m38022a(str2);
                jVar.mo26454d("sub_source");
                C16610ap loadSync = iResourceLoaderService.loadSync(a3, jVar);
                if (loadSync != null) {
                    File file = new File(loadSync.f39755o + File.separator + a2);
                    if (file.exists()) {
                        return file.getAbsolutePath();
                    }
                }
            }
        }
        return null;
    }
}
