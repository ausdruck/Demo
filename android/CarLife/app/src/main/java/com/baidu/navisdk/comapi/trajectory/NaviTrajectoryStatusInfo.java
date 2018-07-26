package com.baidu.navisdk.comapi.trajectory;

public class NaviTrajectoryStatusInfo {
    public int mBrakeCnt = 0;
    public int mCurveCnt = 0;
    public int mOverSpeedCnt = 0;
    public int mRapidAccCnt = 0;
    public boolean mShowFlag = false;

    public String toString() {
        return "mOverSpeedCnt:" + this.mOverSpeedCnt + ", mRapidAccCnt:" + this.mRapidAccCnt + ", mBrakeCnt:" + this.mBrakeCnt + ", mCurveCnt:" + this.mCurveCnt + ",mShowFlag:" + this.mShowFlag;
    }
}
