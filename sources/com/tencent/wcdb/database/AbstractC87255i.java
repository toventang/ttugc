package com.tencent.wcdb.database;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.AbstractC87265g;
import com.tencent.wcdb.FileUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.Log;
import java.io.File;

/* renamed from: com.tencent.wcdb.database.i */
public abstract class AbstractC87255i {

    /* renamed from: a */
    private final Context f197726a;

    /* renamed from: b */
    private final SQLiteDatabase.AbstractC87242a f197727b;

    /* renamed from: c */
    public final String f197728c;

    /* renamed from: d */
    private final int f197729d;

    /* renamed from: e */
    private SQLiteDatabase f197730e;

    /* renamed from: f */
    private boolean f197731f;

    /* renamed from: g */
    private boolean f197732g;

    /* renamed from: h */
    private boolean f197733h;

    /* renamed from: i */
    private final AbstractC87265g f197734i;

    /* renamed from: j */
    private byte[] f197735j;

    /* renamed from: k */
    private SQLiteCipherSpec f197736k;

    /* renamed from: l */
    private int f197737l;

    /* renamed from: m */
    private boolean f197738m;

    /* renamed from: a */
    public abstract void mo31704a(SQLiteDatabase sQLiteDatabase);

    /* renamed from: a */
    public abstract void mo31705a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* renamed from: b */
    public void mo31706b(SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: c */
    public void mo31708c(SQLiteDatabase sQLiteDatabase) {
    }

    static {
        Covode.recordClassIndex(103144);
        SQLiteGlobal.loadLib();
    }

    /* renamed from: b */
    public final SQLiteDatabase mo141244b() {
        SQLiteDatabase a;
        synchronized (this) {
            a = mo31695a();
        }
        return a;
    }

    public synchronized void close() {
        if (!this.f197731f) {
            SQLiteDatabase sQLiteDatabase = this.f197730e;
            if (sQLiteDatabase != null && sQLiteDatabase.mo141215m()) {
                this.f197730e.close();
                this.f197730e = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    /* renamed from: a */
    private SQLiteDatabase mo31695a() {
        int i;
        File file;
        File file2;
        int i2;
        SQLiteDatabase sQLiteDatabase = this.f197730e;
        File file3 = null;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.mo141215m()) {
                this.f197730e = null;
            } else if (!this.f197730e.mo141213k()) {
                return this.f197730e;
            }
        }
        if (!this.f197731f) {
            SQLiteDatabase sQLiteDatabase2 = this.f197730e;
            try {
                this.f197731f = true;
                if (sQLiteDatabase2 == null) {
                    String str = this.f197728c;
                    if (str == null) {
                        sQLiteDatabase2 = SQLiteDatabase.m151330a(":memory:", null, null, null, 268435456, null, 0);
                    } else {
                        boolean z = this.f197733h;
                        try {
                            this.f197738m = true;
                            if (this.f197732g) {
                                i = 8;
                            } else {
                                i = 0;
                            }
                            this.f197737l = i;
                            Context context = this.f197726a;
                            byte[] bArr = this.f197735j;
                            SQLiteCipherSpec sQLiteCipherSpec = this.f197736k;
                            SQLiteDatabase.AbstractC87242a aVar = this.f197727b;
                            AbstractC87265g gVar = this.f197734i;
                            if (str.charAt(0) == File.separatorChar) {
                                file = new File(str.substring(0, str.lastIndexOf(File.separatorChar)));
                                file2 = new File(file, str.substring(str.lastIndexOf(File.separatorChar)));
                            } else if (context != null) {
                                String str2 = context.getApplicationInfo().dataDir;
                                if (str2 != null) {
                                    file3 = new File(str2);
                                }
                                file = new File(file3, "databases");
                                if (file.getPath().equals("databases")) {
                                    file = new File("/data/system");
                                }
                                if (str.indexOf(File.separatorChar) < 0) {
                                    file2 = new File(file, str);
                                } else {
                                    throw new IllegalArgumentException("File " + str + " contains a path separator");
                                }
                            } else {
                                throw new RuntimeException("Not supported in system context");
                            }
                            if (!file.isDirectory() && file.mkdir()) {
                                FileUtils.setPermissions(file.getPath(), 505, -1, -1);
                            }
                            if ((i & 8) != 0) {
                                i2 = 805306368;
                            } else {
                                i2 = 268435456;
                            }
                            SQLiteDatabase a = SQLiteDatabase.m151330a(file2.getPath(), bArr, sQLiteCipherSpec, aVar, i2, gVar, z ? 1 : 0);
                            String path = file2.getPath();
                            int i3 = 432;
                            if ((i & 1) != 0) {
                                i3 = 436;
                            }
                            if ((i & 2) != 0) {
                                i3 |= 2;
                            }
                            FileUtils.setPermissions(path, i3, -1, -1);
                            sQLiteDatabase2 = a;
                        } catch (SQLiteException e) {
                            throw e;
                        }
                    }
                } else if (sQLiteDatabase2.mo141213k()) {
                    synchronized (sQLiteDatabase2.f197650a) {
                        sQLiteDatabase2.mo141221s();
                        if (sQLiteDatabase2.mo141214l()) {
                            int i4 = sQLiteDatabase2.f197651b.f197711d;
                            sQLiteDatabase2.f197651b.f197711d = (sQLiteDatabase2.f197651b.f197711d & -2) | 0;
                            try {
                                sQLiteDatabase2.f197652c.mo141234a(sQLiteDatabase2.f197651b);
                            } catch (RuntimeException e2) {
                                sQLiteDatabase2.f197651b.f197711d = i4;
                                throw e2;
                            }
                        }
                    }
                }
                return m151403d(sQLiteDatabase2);
            } finally {
                this.f197731f = false;
                if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.f197730e)) {
                    sQLiteDatabase2.close();
                }
            }
        } else {
            throw new IllegalStateException("getDatabase called recursively");
        }
    }

    /* renamed from: d */
    private SQLiteDatabase m151403d(SQLiteDatabase sQLiteDatabase) {
        mo31706b(sQLiteDatabase);
        int j = sQLiteDatabase.mo141212j();
        if (j != this.f197729d) {
            if (!sQLiteDatabase.mo141213k()) {
                sQLiteDatabase.mo141206b(true);
                if (j == 0) {
                    try {
                        mo31704a(sQLiteDatabase);
                    } catch (Throwable th) {
                        sQLiteDatabase.mo141209g();
                        throw th;
                    }
                } else {
                    int i = this.f197729d;
                    if (j > i) {
                        mo31707b(sQLiteDatabase, j, i);
                    } else {
                        mo31705a(sQLiteDatabase, j, i);
                    }
                }
                sQLiteDatabase.mo141202a(this.f197729d);
                sQLiteDatabase.mo141210h();
                sQLiteDatabase.mo141209g();
            } else {
                throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.mo141212j() + " to " + this.f197729d + ": " + this.f197728c);
            }
        }
        mo31708c(sQLiteDatabase);
        if (sQLiteDatabase.mo141213k()) {
            Log.m151457a(5, "WCDB.SQLiteOpenHelper", "Opened " + this.f197728c + " in read-only mode");
        }
        this.f197730e = sQLiteDatabase;
        return sQLiteDatabase;
    }

    /* renamed from: b */
    public void mo31707b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public AbstractC87255i(Context context, String str, byte[] bArr, AbstractC87265g gVar) {
        this(context, str, bArr, null, 38, gVar);
    }

    private AbstractC87255i(Context context, String str, byte[] bArr, SQLiteDatabase.AbstractC87242a aVar, int i, AbstractC87265g gVar) {
        this.f197726a = context;
        this.f197728c = str;
        this.f197727b = null;
        this.f197729d = 38;
        this.f197734i = gVar;
        this.f197735j = bArr;
        this.f197736k = null;
        this.f197738m = false;
    }
}
