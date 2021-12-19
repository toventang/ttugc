package com.p2082ss.mediakit.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;

/* renamed from: com.ss.mediakit.net.AVMDLHostProcessor */
public class AVMDLHostProcessor {
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private int mEnableParallel;
    private Handler mHandler;
    public String mHost;
    public HashMap<AVMDLDNSParserListener, Integer> mListeners;
    private int mMainType;
    private BaseDNS[] mParsers = new BaseDNS[2];
    private int[] mStates = new int[2];

    static {
        Covode.recordClassIndex(101229);
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
        AVMDLLog.m147905d("AVMDLHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("id: %s is empty", new Object[]{str}));
            return false;
        }
        for (int i = 0; i < 2; i++) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i] != null && str.equals(baseDNSArr[i].mId)) {
                AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i)}));
                return true;
            }
        }
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("id: %s is valid", new Object[]{str}));
        return false;
    }

    public void processMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
        if (i != 5) {
            if (i == 6) {
                int[] iArr = this.mStates;
                if ((iArr[0] == 1 || iArr[0] == 2 || iArr[0] == 3 || this.mEnableParallel > 0) && iArr[1] == 0) {
                    AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("main dns is not end or enable parrallel and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i, aVMDLDNSInfo);
                }
            }
        } else if (this.mStates[0] == 0) {
            AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("main dns is idle call main dns", new Object[0]));
            doParseInternal(i, aVMDLDNSInfo);
        }
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
    }

    private void doParseInternal(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo}));
        if (aVMDLDNSInfo != null) {
            if (i == 5) {
                if (this.mParsers[0] == null) {
                    AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), aVMDLDNSInfo.mHost}));
                    this.mStates[0] = 1;
                    this.mParsers[0] = createDNSParser(aVMDLDNSInfo.mHost, this.mMainType, 0);
                    this.mParsers[0].start();
                    Message message = new Message();
                    message.what = 6;
                    message.obj = aVMDLDNSInfo;
                    if (this.mBackUpDelayedTime > 0 || this.mEnableParallel > 0) {
                        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("BackUpDelayedTime:%d enableparallel:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType), Integer.valueOf(this.mEnableParallel)}));
                        this.mHandler.sendMessageDelayed(message, (long) (this.mBackUpDelayedTime * 1000));
                    }
                }
            } else if (i == 6 && this.mParsers[1] == null) {
                AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mBackUpType), aVMDLDNSInfo.mHost}));
                this.mStates[1] = 1;
                this.mParsers[1] = createDNSParser(aVMDLDNSInfo.mHost, this.mBackUpType, 1);
                this.mParsers[1].start();
            }
            AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("****do parse internal end", new Object[0]));
        }
    }

    public void processResult(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        String str;
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("----process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost}));
        if (i == 2 || i == 3) {
            str = aVMDLDNSInfo.mId;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("****process result err id is empty", new Object[0]));
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
                AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("****process result parser index:%d is end, be close", new Object[]{Integer.valueOf(i2)}));
            }
        }
        if (i2 == 0 && i == 2) {
            AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("mian dns parse error, try back up dns", new Object[0]));
            processMsg(6, new AVMDLDNSInfo(this.mBackUpType, aVMDLDNSInfo.mHost, (String) null, 0, (String) null));
        }
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("****end process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost}));
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        try {
            CreateConstructor createConstructor = AVMDLDNSManager.getInstance().getCreateConstructor(i);
            if (createConstructor != null) {
                return createConstructor.createDns(str, null, i, this.mHandler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i != 4 || AVMDLDNSParser.mCustomHttpDNSParser == null) {
            AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
            return new LocalDNS(str, this.mHandler);
        }
        AVMDLLog.m147905d("AVMDLHostProcessor", C1764a.m5928a("create custom httpdns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i)}));
        return new CustomHTTPDNS(str, this.mHandler);
    }

    public AVMDLHostProcessor(String str, Handler handler, int i, int i2, int i3, int i4) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        this.mEnableParallel = i4;
        int i5 = 0;
        do {
            this.mParsers[i5] = null;
            i5++;
        } while (i5 < 2);
        int i6 = 0;
        do {
            this.mStates[i6] = 0;
            i6++;
        } while (i6 < 2);
        this.mListeners = new HashMap<>();
    }
}
