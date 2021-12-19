package com.p2082ss.ttuploader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.ttuploader.TTUploadSpeedProber */
public class TTUploadSpeedProber implements TTVideoUploaderListener {
    private Context mContext;
    private long mEndTime;
    private long mEndTime1;
    private String mFilePath;
    private InputStream mInputStream;
    AtomicBoolean mIsEnd;
    public TTUploadSpeedProberListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private long mStartTime1;
    private int mTestSize;
    private Timer mTimer;
    public TTVideoUploader mUploader;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;

    static {
        Covode.recordClassIndex(101489);
    }

    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
    public String getStringFromExtern(int i) {
        return null;
    }

    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
    public void onLog(int i, int i2, String str) {
    }

    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
    public void onUploadVideoStage(int i, long j) {
    }

    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
    public int videoUploadCheckNetState(int i, int i2) {
        return 1;
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            TTVideoUploader tTVideoUploader = this.mUploader;
            if (tTVideoUploader != null) {
                tTVideoUploader.close();
                this.mUploader = null;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setListener(TTUploadSpeedProberListener tTUploadSpeedProberListener) {
        if (tTUploadSpeedProberListener != null) {
            this.mListener = tTUploadSpeedProberListener;
        }
    }

    /* renamed from: com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m148571x4a7067e4(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m148570x1555371f(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m148572x4af396a1(File file) {
        MethodCollector.m26663i(13234);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13234);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13234);
        return delete;
    }

    private String getFilePath(Context context) {
        try {
            String absolutePath = m148570x1555371f(m148571x4a7067e4(context)).getAbsolutePath();
            if (absolutePath == null) {
                return null;
            }
            String str = absolutePath + File.separator + "speedprober";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            return str + File.separator + "speedprober.test";
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean initFile(int i) {
        MethodCollector.m26663i(13233);
        try {
            File file = new File(this.mFilePath);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                m148572x4af396a1(file);
                file.createNewFile();
            }
            byte[] bArr = new byte[1024];
            int i2 = 0;
            while (true) {
                bArr[i2] = 97;
                i2++;
                if (i2 >= 1024) {
                    break;
                }
            }
            String str = new String(bArr);
            FileWriter fileWriter = new FileWriter(file, true);
            try {
                int i3 = (i / 1024) + 1;
                for (int i4 = 0; i4 <= i3; i4++) {
                    fileWriter.write(str);
                }
                fileWriter.close();
                MethodCollector.m26664o(13233);
                return true;
            } catch (Throwable unused) {
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                MethodCollector.m26664o(13233);
                return false;
            }
        } catch (Throwable unused2) {
            MethodCollector.m26664o(13233);
            return false;
        }
    }

    public TTUploadSpeedProber(Context context, int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        if (context != null) {
            String filePath = getFilePath(context);
            this.mFilePath = filePath;
            if (filePath == null) {
                throw new Exception("get file path null");
            } else if (initFile(i)) {
                this.mTestSize = i;
                this.mContext = context;
                try {
                    TTVideoUploader tTVideoUploader = new TTVideoUploader();
                    this.mUploader = tTVideoUploader;
                    tTVideoUploader.setPathName(this.mFilePath);
                    this.mUploader.setListener(this);
                    this.mUploader.setTestSpeed(true);
                    this.mReadLock = reentrantReadWriteLock.readLock();
                    this.mWriteLock = reentrantReadWriteLock.writeLock();
                    this.mStartTime = 0;
                    this.mEndTime = 0;
                    this.mStartTime1 = 0;
                    this.mEndTime1 = 0;
                    this.mTimer = new Timer();
                    this.mIsEnd = new AtomicBoolean(false);
                } catch (Throwable th) {
                    throw new Exception("TTUploadSpeedProber create image uploader fail" + th.toString());
                }
            } else {
                throw new Exception("init file fail");
            }
        } else {
            throw new Exception("context is null create TTUploadSpeedProber fail");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotify(int r5, long r6, com.p2082ss.ttuploader.TTVideoInfo r8) {
        /*
            r4 = this;
            r3 = 1
            if (r5 != 0) goto L_0x003c
            long r0 = java.lang.System.currentTimeMillis()
            r4.mEndTime = r0
            com.ss.ttuploader.TTUploadSpeedProberListener r0 = r4.mListener
            if (r0 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.mIsEnd
            r0.set(r3)
            r0 = 0
            if (r8 == 0) goto L_0x0031
            org.json.JSONObject r1 = r8.mLog
            r0 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "speedinfo"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = "0"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = "avspeed"
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x002d }
            goto L_0x0032
        L_0x002d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0031:
            r0 = 0
        L_0x0032:
            com.ss.ttuploader.TTUploadSpeedProberListener r2 = r4.mListener
            if (r0 <= 0) goto L_0x0037
            r3 = 0
        L_0x0037:
            long r0 = (long) r0
            r2.onNotify(r3, r0)
            return
        L_0x003c:
            if (r5 != r3) goto L_0x004b
            r1 = 2
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            long r0 = java.lang.System.currentTimeMillis()
            r4.mStartTime1 = r0
            return
        L_0x004b:
            r0 = 2
            if (r5 != r0) goto L_0x005e
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.mIsEnd
            r0.set(r3)
            r0 = 0
            r4.mEndTime = r0
            com.ss.ttuploader.TTUploadSpeedProberListener r0 = r4.mListener
            if (r0 == 0) goto L_0x005e
            r0.onNotify(r3, r6)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttuploader.TTUploadSpeedProber.onNotify(int, long, com.ss.ttuploader.TTVideoInfo):void");
    }

    public void start(String str, String str2, String str3, long j) {
        this.mWriteLock.lock();
        try {
            if (this.mStartTime == 0) {
                this.mStartTime = System.currentTimeMillis();
                this.mUploader.setVideoUploadDomain(str);
                this.mUploader.setAuthorization(str2);
                this.mUploader.setUserKey(str3);
                this.mUploader.setSocketNum(1);
                this.mUploader.setSliceSize(524288);
                this.mUploader.setSliceTimeout(10);
                this.mUploader.setFileRetryCount(0);
                this.mUploader.setSliceReTryCount(0);
                this.mUploader.start();
                this.mTimer.schedule(new TimerTask() {
                    /* class com.p2082ss.ttuploader.TTUploadSpeedProber.C862891 */

                    static {
                        Covode.recordClassIndex(101490);
                    }

                    /* renamed from: com_ss_ttuploader_TTUploadSpeedProber$1_com_ss_android_ugc_aweme_lancet_LogLancet_e */
                    public static int m148573xdef5dfda(String str, String str2) {
                        return 0;
                    }

                    /* JADX INFO: finally extract failed */
                    public void run() {
                        TTUploadSpeedProber.this.mWriteLock.lock();
                        try {
                            if (!TTUploadSpeedProber.this.mIsEnd.get() && TTUploadSpeedProber.this.mUploader != null) {
                                TTUploadSpeedProber.this.mUploader.close();
                                TTUploadSpeedProber.this.mUploader = null;
                                if (TTUploadSpeedProber.this.mListener != null) {
                                    TTUploadSpeedProber.this.mListener.onNotify(2, 0);
                                }
                            }
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                            m148573xdef5dfda("lzp", "timer excute");
                        } catch (Throwable th) {
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                            throw th;
                        }
                    }
                }, j);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }
}
