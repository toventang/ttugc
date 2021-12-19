package com.bytedance.p802b.p819d;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.apm.p789q.C12601u;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p819d.C13031c;
import com.bytedance.p802b.p819d.p820a.C13028a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.p845d.AbstractRunnableC13123a;
import com.bytedance.p802b.p841k.p845d.C13124b;
import com.bytedance.p802b.p841k.p845d.EnumC13126c;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.b.d.a */
public final class C13026a {

    /* renamed from: a */
    public static C13026a f31743a = new C13026a();

    /* renamed from: b */
    public C13028a f31744b;

    /* renamed from: c */
    public volatile boolean f31745c;

    /* renamed from: d */
    public AbstractRunnableC13123a f31746d;

    /* renamed from: e */
    private volatile boolean f31747e;

    static {
        Covode.recordClassIndex(14862);
    }

    /* renamed from: a */
    private synchronized void m23387a() {
        if (!this.f31747e) {
            C13028a aVar = this.f31744b;
            if (aVar != null && aVar.f31749a && this.f31744b.f31760l) {
                if (C13037a.m23435c()) {
                    this.f31747e = true;
                    this.f31746d = new AbstractRunnableC13123a() {
                        /* class com.bytedance.p802b.p819d.C13026a.C130271 */

                        static {
                            Covode.recordClassIndex(14863);
                        }

                        public final void run() {
                            File file;
                            File file2;
                            File file3;
                            System.currentTimeMillis();
                            SharedPreferences a = C34822d.m71158a(C13113a.f31955g, "monitor_config", 0);
                            long j = 0;
                            if (a != null) {
                                j = a.getLong("check_disk_last_time", 0);
                            }
                            if (System.currentTimeMillis() - j >= 86400000) {
                                C13031c cVar = C13031c.f31773a;
                                C13028a aVar = C13026a.this.f31744b;
                                C13030b bVar = null;
                                if (aVar != null && !cVar.f31778f) {
                                    cVar.f31782j = aVar;
                                    if (!cVar.f31781i) {
                                        cVar.f31781i = true;
                                        Application application = C13113a.f31955g;
                                        try {
                                            application.getPackageName();
                                            if (C58016d.f132222c == null || !C58016d.f132224e) {
                                                file = application.getFilesDir();
                                                C58016d.f132222c = file;
                                            } else {
                                                file = C58016d.f132222c;
                                            }
                                            cVar.f31774b = file.getParent();
                                            if (C58016d.f132221b == null || !C58016d.f132224e) {
                                                file2 = application.getCacheDir();
                                                C58016d.f132221b = file2;
                                            } else {
                                                file2 = C58016d.f132221b;
                                            }
                                            cVar.f31775c = file2.getAbsolutePath();
                                            cVar.f31776d = C13031c.m23402a(application);
                                            if (C58016d.f132220a == null || !C58016d.f132224e) {
                                                file3 = application.getExternalCacheDir();
                                                C58016d.f132220a = file3;
                                            } else {
                                                file3 = C58016d.f132220a;
                                            }
                                            if (file3 != null) {
                                                cVar.f31777e = file3.getAbsolutePath();
                                            }
                                        } catch (Exception unused) {
                                            cVar.f31778f = true;
                                        }
                                    }
                                    cVar.f31779g = cVar.mo20894b(aVar.f31759k);
                                    cVar.f31780h = cVar.mo20894b(aVar.f31758j);
                                    ArrayList<C13031c.C13032a> arrayList = new ArrayList();
                                    cVar.mo20892a(new File(cVar.f31774b), arrayList);
                                    cVar.mo20892a(new File(cVar.f31776d), arrayList);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (C13031c.C13032a aVar2 : arrayList) {
                                        Iterator<C13031c.C13032a> it = aVar2.f31793f.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (it.next().f31791d) {
                                                    break;
                                                }
                                            } else {
                                                arrayList2.remove(aVar2);
                                                break;
                                            }
                                        }
                                    }
                                    arrayList.removeAll(arrayList2);
                                    if (C13037a.m23579r()) {
                                        for (C13031c.C13032a aVar3 : arrayList) {
                                            aVar3.mo20896a();
                                        }
                                    }
                                    C12601u<C13031c.C13033b> uVar = new C12601u<>(cVar.f31782j.f31755g);
                                    C12601u<C13031c.C13033b> uVar2 = new C12601u<>(cVar.f31782j.f31756h);
                                    C12601u<C13031c.C13033b> uVar3 = new C12601u<>(cVar.f31782j.f31754f);
                                    List<String> arrayList3 = new ArrayList<>();
                                    arrayList3.add(cVar.f31774b);
                                    arrayList3.add(cVar.f31775c);
                                    cVar.mo20893a(cVar.mo20891a(cVar.f31774b, uVar, uVar2, uVar3, arrayList3));
                                    arrayList3.clear();
                                    arrayList3.add(cVar.f31777e);
                                    arrayList3.add(cVar.f31776d);
                                    cVar.mo20893a(cVar.mo20891a(cVar.f31776d, uVar, uVar2, uVar3, arrayList3));
                                    if (C13037a.m23579r()) {
                                        for (C13031c.C13033b bVar2 : uVar.mo20415a()) {
                                            bVar2.mo20897a();
                                        }
                                        for (C13031c.C13033b bVar3 : uVar2.mo20415a()) {
                                            bVar3.mo20897a();
                                        }
                                        for (C13031c.C13033b bVar4 : uVar3.mo20415a()) {
                                            bVar4.mo20897a();
                                        }
                                    }
                                    cVar.mo20895c(arrayList);
                                    bVar = cVar.mo20890a(uVar, uVar2, uVar3, arrayList);
                                }
                                if (C13037a.m23579r()) {
                                    bVar.mo20772c();
                                }
                                C13092a.m23544a(bVar);
                                a.edit().putLong("check_disk_last_time", System.currentTimeMillis()).commit();
                            }
                            C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20944b(C13026a.this.f31746d);
                            if (C13037a.m23579r()) {
                                System.currentTimeMillis();
                            }
                        }
                    };
                    C13124b.m23597a(EnumC13126c.LIGHT_WEIGHT).mo20943a(this.f31746d);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20885a(C13028a aVar) {
        if (aVar != null) {
            this.f31744b = aVar;
            if (this.f31745c) {
                AbstractC13106a aVar2 = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
                if (aVar2 != null && !aVar2.mo20901a()) {
                    m23387a();
                }
            }
        }
    }
}
