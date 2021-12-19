package com.p2082ss.ttuploader;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.ttuploader.TTImageXUploader */
public class TTImageXUploader extends TTImageUploaderAbstractListener implements TTImageUploaderListener {
    private TTImageXUploaderAbstractListener mAbstractListener;
    private TTImageUploader mImageUploader;
    private TTImageXUploaderListener mListener;

    static {
        Covode.recordClassIndex(101478);
    }

    /* renamed from: com_ss_ttuploader_TTImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148558xf019b2f0(String str, String str2) {
        return 0;
    }

    public static boolean isError() {
        return TTImageUploader.isError();
    }

    public void close() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.close();
        }
    }

    public void start() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.start();
        }
    }

    public void stop() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.stop();
        }
    }

    public TTImageXUploader() {
        try {
            TTImageUploader tTImageUploader = new TTImageUploader(4);
            this.mImageUploader = tTImageUploader;
            tTImageUploader.setListener(this);
            this.mImageUploader.setAbstractListener(this);
        } catch (Throwable th) {
            this.mImageUploader = null;
            m148558xf019b2f0("ttmn", th.toString());
        }
        if (this.mImageUploader == null) {
            throw new Exception("create native uploader fail");
        }
    }

    public void setAbstractListener(TTImageXUploaderAbstractListener tTImageXUploaderAbstractListener) {
        this.mAbstractListener = tTImageXUploaderAbstractListener;
    }

    public void setListener(TTImageXUploaderListener tTImageXUploaderListener) {
        this.mListener = tTImageXUploaderListener;
    }

    public void setEnableHttps(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setEnableHttps(i);
        }
    }

    public void setFileRetryCount(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setFileRetryCount(i);
        }
    }

    public void setImageUploadDomain(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setImageUploadDomain(str);
        }
    }

    public void setMaxFailTime(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setMaxFailTime(i);
        }
    }

    public void setOpenBoe(boolean z) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setOpenBoe(z);
        }
    }

    public void setScenesTag(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setScenesTag(str);
        }
    }

    public void setServerParameter(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setServerParameter(str);
        }
    }

    public void setSliceReTryCount(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setSliceReTryCount(i);
        }
    }

    public void setSliceTimeout(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setSliceTimeout(i);
        }
    }

    public void setSocketNum(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setSocketNum(i);
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setTraceIDConfig(map);
        }
    }

    public void setTranTimeOutUnit(int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setTranTimeOutUnit(i);
        }
    }

    public void setUploadToken(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setUploadToken(str);
        }
    }

    @Override // com.p2082ss.ttuploader.TTImageUploaderAbstractListener
    public int imageUploadCheckNetState(int i, int i2) {
        TTImageXUploaderAbstractListener tTImageXUploaderAbstractListener = this.mAbstractListener;
        if (tTImageXUploaderAbstractListener == null) {
            return -2;
        }
        return tTImageXUploaderAbstractListener.imagexUploadCheckNetState(i, i2);
    }

    public void setFileName(int i, String[] strArr) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setFileName(i, strArr);
        }
    }

    public void setFilePath(int i, String[] strArr) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setFilePath(i, strArr);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setMediaDataReader(tTMediaDataReader, i);
        }
    }

    public void setStringValue(int i, String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setStringValue(i, str);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i, int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setMediaDataReader(tTMediaDataReader, i, i2);
        }
    }

    @Override // com.p2082ss.ttuploader.TTImageUploaderListener
    public void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        TTImageXInfo tTImageXInfo;
        m148558xf019b2f0("ttmn", C1764a.m5928a("what:%d,parameter:%d", new Object[]{Integer.valueOf(i), Long.valueOf(j)}));
        if (tTImageInfo != null) {
            tTImageXInfo = new TTImageXInfo(tTImageInfo.mImageToskey, tTImageInfo.mProgress, tTImageInfo.mFileIndex, tTImageInfo.mMetaInfo);
        } else {
            tTImageXInfo = null;
        }
        if (i == 0) {
            this.mListener.onNotify(i, j, null);
        } else if (i == 1) {
            this.mListener.onNotify(i, j, null);
        } else if (i == 3) {
            this.mListener.onNotify(i, j, tTImageXInfo);
        } else if (i == 4) {
            tTImageXInfo.mErrcode = tTImageInfo.mErrcode;
            tTImageXInfo.mProgress = tTImageInfo.mProgress;
            this.mListener.onNotify(i, j, tTImageXInfo);
        } else if (i == 2) {
            this.mListener.onNotify(i, j, tTImageXInfo);
        }
    }
}
