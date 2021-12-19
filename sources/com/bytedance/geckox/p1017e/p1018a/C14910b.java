package com.bytedance.geckox.p1017e.p1018a;

import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14873b;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1015c.C14897b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.C15050c;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Map;

/* renamed from: com.bytedance.geckox.e.a.b */
public class C14910b extends AbstractC21935d<Pair<AbstractC14888a, UpdatePackage>, Pair<AbstractC14888a, UpdatePackage>> {
    static {
        Covode.recordClassIndex(17023);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
    }

    /* renamed from: a */
    private static boolean m27424a(File file) {
        MethodCollector.m26663i(5512);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5512);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5512);
        return delete;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24020a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        return m27423a(bVar, pair);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.io.ObjectInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static Object m27423a(AbstractC21931b<Pair<AbstractC14888a, UpdatePackage>> bVar, Pair<AbstractC14888a, UpdatePackage> pair) {
        Throwable th;
        Exception e;
        Throwable th2;
        Exception e2;
        MethodCollector.m26663i(5510);
        C14957a.m27543a("start merge dir, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14888a aVar = (AbstractC14888a) pair.first;
        File f = aVar.mo23980f();
        aVar.mo23970a();
        aVar.mo23979e();
        File file = new File(f.getParentFile().getParentFile(), ((UpdatePackage) pair.second).getLocalVersion() + File.separator + "res");
        File file2 = new File(f.getParentFile(), "res");
        C15052e.m27714c(file2);
        try {
            C14873b bVar2 = new C14873b();
            if (!file.exists() || file.isFile()) {
                C14897b bVar3 = new C14897b(1000, "param src error: " + file.getPath());
                MethodCollector.m26664o(5510);
                throw bVar3;
            } else if (!f.exists() || f.isDirectory()) {
                C14897b bVar4 = new C14897b(1000, "param patch error: " + f.getPath());
                MethodCollector.m26664o(5510);
                throw bVar4;
            } else if (file2.exists() && file2.isFile()) {
                C14897b bVar5 = new C14897b(1000, "param dest error,  is a file: " + file2.getPath());
                MethodCollector.m26664o(5510);
                throw bVar5;
            } else if (!file2.exists() || !file2.isDirectory() || C15052e.m27714c(file2)) {
                bVar2.f36333d = file;
                bVar2.f36334e = file2;
                bVar2.f36335f = f;
                try {
                    bVar2.f36332c = new RandomAccessFile(bVar2.f36335f, "rw");
                    byte[] bArr = new byte[8];
                    bVar2.f36332c.readFully(bArr);
                    if ("BYTEDIFF".equals(new String(bArr))) {
                        byte readByte = bVar2.f36332c.readByte();
                        if (readByte > 1 || readByte < 0) {
                            C14897b bVar6 = new C14897b(1005, "unsupported version: ".concat(String.valueOf((int) readByte)));
                            MethodCollector.m26664o(5510);
                            throw bVar6;
                        }
                        bVar2.f36336g = readByte;
                        ObjectOutputStream objectOutputStream = null;
                        if (readByte > 0) {
                            File file3 = new File(bVar2.f36333d.getParentFile(), "modify_time");
                            if (file3.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file3);
                                try {
                                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                                    try {
                                        bVar2.f36331b = (Map) objectInputStream.readObject();
                                        C15050c.m27709a(fileInputStream);
                                        C15050c.m27709a(objectInputStream);
                                    } catch (Exception e3) {
                                        e2 = e3;
                                        objectOutputStream = objectInputStream;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        objectOutputStream = objectInputStream;
                                        C15050c.m27709a(fileInputStream);
                                        C15050c.m27709a(objectOutputStream);
                                        MethodCollector.m26664o(5510);
                                        throw th2;
                                    }
                                } catch (Exception e4) {
                                    e2 = e4;
                                    try {
                                        C14897b bVar7 = new C14897b(1002, C1764a.m5928a("read modify_time file error: %s, path: %s", new Object[]{e2.getMessage(), file3.getPath()}));
                                        MethodCollector.m26664o(5510);
                                        throw bVar7;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        C15050c.m27709a(fileInputStream);
                                        C15050c.m27709a(objectOutputStream);
                                        MethodCollector.m26664o(5510);
                                        throw th2;
                                    }
                                }
                            } else {
                                C14897b bVar8 = new C14897b(1001, "modify_time file not exist: " + file3.getPath());
                                MethodCollector.m26664o(5510);
                                throw bVar8;
                            }
                        }
                        bVar2.mo23959a();
                        bVar2.f36337h = "";
                        if (readByte == 0) {
                            bVar2.mo23961b(bVar2.f36333d);
                        } else {
                            bVar2.mo23960b();
                        }
                        File file4 = new File(bVar2.f36334e.getParentFile(), "modify_time");
                        if (!file4.exists() || C14873b.m27305a(file4)) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file4);
                            try {
                                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                                try {
                                    objectOutputStream2.writeObject(bVar2.f36330a);
                                    C15050c.m27709a(fileOutputStream);
                                    C15050c.m27709a(objectOutputStream2);
                                    C15050c.m27709a(bVar2.f36332c);
                                    m27424a(f);
                                    Object a = bVar.mo35692a(pair);
                                    MethodCollector.m26664o(5510);
                                    return a;
                                } catch (Exception e5) {
                                    e = e5;
                                    objectOutputStream = objectOutputStream2;
                                    try {
                                        C14897b bVar9 = new C14897b(1002, C1764a.m5928a("saveDirModifyTime failed, writeToFile error: %s, path: %s", new Object[]{e.getMessage(), file4.getPath()}));
                                        MethodCollector.m26664o(5510);
                                        throw bVar9;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        C15050c.m27709a(fileOutputStream);
                                        C15050c.m27709a(objectOutputStream);
                                        MethodCollector.m26664o(5510);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    objectOutputStream = objectOutputStream2;
                                    C15050c.m27709a(fileOutputStream);
                                    C15050c.m27709a(objectOutputStream);
                                    MethodCollector.m26664o(5510);
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                C14897b bVar92 = new C14897b(1002, C1764a.m5928a("saveDirModifyTime failed, writeToFile error: %s, path: %s", new Object[]{e.getMessage(), file4.getPath()}));
                                MethodCollector.m26664o(5510);
                                throw bVar92;
                            }
                        } else {
                            C14897b bVar10 = new C14897b(1004, "remove modifyTimePath error: " + file4.getPath());
                            MethodCollector.m26664o(5510);
                            throw bVar10;
                        }
                    } else {
                        C14897b bVar11 = new C14897b(1005, "not bytediff file: " + new String(bArr));
                        MethodCollector.m26664o(5510);
                        throw bVar11;
                    }
                } catch (C14897b e7) {
                    MethodCollector.m26664o(5510);
                    throw e7;
                } catch (Exception e8) {
                    C14897b bVar12 = new C14897b(1099, bVar2.f36337h + e8.getMessage());
                    MethodCollector.m26664o(5510);
                    throw bVar12;
                } catch (Throwable th7) {
                    C15050c.m27709a(bVar2.f36332c);
                    MethodCollector.m26664o(5510);
                    throw th7;
                }
            } else {
                C14897b bVar13 = new C14897b(1000, "param dest error, remove failed: " + file2.getPath());
                MethodCollector.m26664o(5510);
                throw bVar13;
            }
        } catch (Exception e9) {
            C14957a.m27544b();
            MethodCollector.m26664o(5510);
            throw e9;
        } catch (Throwable th8) {
            m27424a(f);
            MethodCollector.m26664o(5510);
            throw th8;
        }
    }
}
