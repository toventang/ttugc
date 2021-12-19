package com.bytedance.p802b.p806b.p807a.p810c;

import com.C1764a;
import com.bytedance.apm.p771d.C12442b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12927a;
import com.bytedance.p802b.p806b.p807a.C12930b;
import com.bytedance.p802b.p806b.p807a.C12937c;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p830h.AbstractC13094b;
import com.bytedance.p802b.p830h.C13092a;
import com.bytedance.p802b.p841k.C13120c;
import com.bytedance.p802b.p841k.C13122d;
import com.bytedance.p802b.p841k.p843b.C13118b;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.b.a.c.c */
public final class C12945c {

    /* renamed from: a */
    private final File f31524a;

    /* renamed from: b */
    private final long f31525b;

    /* renamed from: c */
    private ByteBuffer f31526c;

    /* renamed from: d */
    private FileLock f31527d;

    static {
        Covode.recordClassIndex(14781);
    }

    /* renamed from: d */
    private int m23229d() {
        return this.f31526c.getInt(10);
    }

    /* renamed from: e */
    private int m23230e() {
        return this.f31526c.getInt(14);
    }

    /* renamed from: c */
    private void m23228c() {
        this.f31526c.clear();
        this.f31526c.putShort(2082);
        this.f31526c.putLong(this.f31525b);
        this.f31526c.putInt(0);
        this.f31526c.putInt(0);
    }

    /* renamed from: b */
    public final synchronized String[] mo20797b() {
        File[] listFiles = C12930b.m23208c().listFiles(new FileFilter() {
            /* class com.bytedance.p802b.p806b.p807a.p810c.C12945c.C129461 */

            static {
                Covode.recordClassIndex(14782);
            }

            public final boolean accept(File file) {
                String name = file.getName();
                if (name.endsWith(".log")) {
                    return true;
                }
                if (name.endsWith(".txt")) {
                    return false;
                }
                C13120c.m23592b(file);
                return false;
            }
        });
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(file.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public final synchronized void mo20795a() {
        boolean z = false;
        short s = this.f31526c.getShort(0);
        this.f31526c.getLong(2);
        int d = m23229d();
        int e = m23230e();
        if (s == 2082 && e > 0) {
            if (d > 0) {
                System.nanoTime();
                FileChannel fileChannel = null;
                try {
                    String str = System.currentTimeMillis() + "_" + UUID.randomUUID().toString();
                    try {
                        if (!this.f31524a.exists()) {
                            File parentFile = this.f31524a.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            this.f31524a.mkdirs();
                        }
                    } catch (Throwable th) {
                        C13118b.m23587a(C12927a.f31456a, "flushDir create error.", th);
                    }
                    File file = new File(this.f31524a, str + ".txt");
                    if (file.exists()) {
                        C13118b.m23586a(C12927a.f31456a, "file is exist:" + file.getName());
                    }
                    fileChannel = new FileOutputStream(file, false).getChannel();
                    this.f31526c.position(e + 18);
                    this.f31526c.flip();
                    fileChannel.write(this.f31526c);
                    if (file.renameTo(new File(this.f31524a, str + ".log"))) {
                        z = true;
                    } else {
                        C13118b.m23586a(C12927a.f31456a, "rename error" + file.getAbsolutePath());
                    }
                    if (C13037a.m23579r()) {
                        file.getAbsolutePath();
                    }
                } catch (Throwable unused) {
                }
                C13122d.m23595a(fileChannel);
                if (!z) {
                    this.f31526c.position(m23230e() + 18);
                    this.f31526c.flip();
                    C12943a a = C12943a.m23227a(this.f31526c);
                    C12937c cVar = C12937c.C12942a.f31517a;
                    if (a != null) {
                        cVar.f31509b.mo20942a(a);
                    }
                }
                m23228c();
                if (C13037a.m23579r()) {
                    System.nanoTime();
                }
                return;
            }
        }
        m23228c();
    }

    /* renamed from: a */
    public final synchronized void mo20796a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            if (C13037a.m23579r()) {
                try {
                    C12442b.C12445a.f30223a.mo20276a("DATA_SAVE_TO_DB", new JSONObject(jSONObject.toString()));
                } catch (Exception unused) {
                }
            }
            byte[] bytes = jSONObject2.getBytes();
            int length = bytes.length + 4;
            if (length > 262144) {
                C13092a.m23544a(new AbstractC13094b() {
                    /* class com.bytedance.p802b.p806b.p807a.p810c.C12945c.C129472 */

                    static {
                        Covode.recordClassIndex(14783);
                    }

                    @Override // com.bytedance.p802b.p830h.AbstractC13094b
                    /* renamed from: a */
                    public final String mo20770a() {
                        return "service_monitor";
                    }

                    @Override // com.bytedance.p802b.p830h.AbstractC13094b
                    /* renamed from: b */
                    public final boolean mo20771b() {
                        return true;
                    }

                    @Override // com.bytedance.p802b.p830h.AbstractC13094b
                    /* renamed from: c */
                    public final JSONObject mo20772c() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("log_type", "service_monitor");
                            jSONObject.put("service", "apm_error");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(StringSet.type, "large_data");
                            jSONObject.put("category", jSONObject2);
                            return jSONObject;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                });
                return;
            }
            if (length > this.f31526c.remaining()) {
                mo20795a();
            }
            this.f31526c.putInt(bytes.length);
            this.f31526c.put(bytes);
            this.f31526c.putInt(10, m23229d() + 1);
            this.f31526c.putInt(14, m23230e() + length);
            if (C13037a.m23579r()) {
                C1764a.m5928a("push success: totalCount=%s, totalBytes=%s, logItem=%s", new Object[]{Integer.valueOf(m23229d()), Integer.valueOf(m23230e()), jSONObject2});
            }
            if (this.f31526c.position() >= 262134 || m23229d() >= 256) {
                mo20795a();
            }
        }
    }

    public C12945c(long j, File file, File file2) {
        this.f31524a = file2;
        this.f31525b = j;
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            this.f31527d = channel.tryLock();
            this.f31526c = channel.map(FileChannel.MapMode.READ_WRITE, 0, 262162);
            mo20795a();
        } catch (Throwable th) {
            C13118b.m23587a(C12927a.f31456a, "create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.f31526c == null) {
            this.f31526c = ByteBuffer.allocate(262162);
        }
        m23228c();
    }
}
