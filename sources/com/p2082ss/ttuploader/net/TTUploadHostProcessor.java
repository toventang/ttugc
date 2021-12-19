package com.p2082ss.ttuploader.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttuploader.TTUploadLog;
import java.util.HashMap;

/* renamed from: com.ss.ttuploader.net.TTUploadHostProcessor */
public class TTUploadHostProcessor {
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private Handler mHandler;
    public String mHost;
    public HashMap<TTUploadDNSParserListener, Integer> mListeners;
    private int mMainType;
    private BaseDNS[] mParsers = new BaseDNS[2];
    private int[] mStates = new int[2];

    static {
        Covode.recordClassIndex(101521);
    }

    public boolean isEnd() {
        for (int i = 0; i < 2; i++) {
            if (this.mParsers[i] != null) {
                int[] iArr = this.mStates;
                if (!(iArr[i] == 3 || iArr[i] == 2)) {
                    return false;
                }
            }
        }
        TTUploadLog.m148564d("TTUploadHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("id: %s is empty", new Object[]{str}));
            return false;
        }
        for (int i = 0; i < 2; i++) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i] != null && str.equals(baseDNSArr[i].mId)) {
                TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i)}));
                return true;
            }
        }
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("id: %s is valid", new Object[]{str}));
        return false;
    }

    public void processMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost, tTUploadDNSInfo}));
        if (i != 0) {
            if (i == 1) {
                int[] iArr = this.mStates;
                if ((iArr[0] == 1 || iArr[0] == 2 || iArr[0] == 3) && iArr[1] == 0) {
                    TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("main dns is not end and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i, tTUploadDNSInfo);
                }
            }
        } else if (this.mStates[0] == 0) {
            TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("main dns is idle call main dns", new Object[0]));
            doParseInternal(i, tTUploadDNSInfo);
        }
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mHost, tTUploadDNSInfo}));
    }

    private void doParseInternal(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo}));
        if (tTUploadDNSInfo != null) {
            if (i == 0) {
                if (this.mParsers[0] == null) {
                    TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), tTUploadDNSInfo.mHost}));
                    this.mStates[0] = 1;
                    this.mParsers[0] = createDNSParser(tTUploadDNSInfo.mHost, this.mMainType, 0);
                    this.mParsers[0].start();
                    Message message = new Message();
                    message.what = 1;
                    message.obj = tTUploadDNSInfo;
                    if (this.mBackUpDelayedTime > 0) {
                        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("BackUpDelayedTime:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType)}));
                        this.mHandler.sendMessageDelayed(message, (long) (this.mBackUpDelayedTime * 1000));
                    }
                }
            } else if (i == 1 && this.mParsers[1] == null) {
                TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), tTUploadDNSInfo.mHost}));
                this.mStates[1] = 1;
                this.mParsers[1] = createDNSParser(tTUploadDNSInfo.mHost, this.mBackUpType, 1);
                this.mParsers[1].start();
            }
            TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("****do parse internal end", new Object[0]));
        }
    }

    public void processResult(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        String str;
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("----process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mId, tTUploadDNSInfo.mHost}));
        if (i == 2 || i == 3) {
            str = tTUploadDNSInfo.mId;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("****process result err id is empty", new Object[0]));
            return;
        }
        int i2 = 0;
        while (true) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i2] == null || !str.equals(baseDNSArr[i2].mId)) {
                i2++;
                if (i2 >= 2) {
                    break;
                }
            } else {
                this.mParsers[i2].close();
                this.mParsers[i2] = null;
                if (i == 3) {
                    this.mStates[i2] = 3;
                } else if (i == 2) {
                    this.mStates[i2] = 2;
                }
                TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("****process result parser index:%d is end, be close", new Object[]{Integer.valueOf(i2)}));
            }
        }
        if (i2 == 0 && i == 2) {
            TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("mian dns parse error, try back up dns", new Object[0]));
            processMsg(1, new TTUploadDNSInfo(TTUploadDNSParser.mGlobalBackType, tTUploadDNSInfo.mHost, null, 0, null));
        }
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("****end process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), tTUploadDNSInfo.mId, tTUploadDNSInfo.mHost}));
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        if (i == 1 || i == 2 || i == 3) {
            TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("create http dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
            return new HTTPDNS(str, null, i, this.mHandler);
        }
        TTUploadLog.m148564d("TTUploadHostProcessor", C1764a.m5928a("create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
        return new LocalDNS(str, this.mHandler);
    }

    public TTUploadHostProcessor(String str, Handler handler, int i, int i2, int i3) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        int i4 = 0;
        do {
            this.mParsers[i4] = null;
            i4++;
        } while (i4 < 2);
        int i5 = 0;
        do {
            this.mStates[i5] = 0;
            i5++;
        } while (i5 < 2);
        this.mListeners = new HashMap<>();
    }
}
