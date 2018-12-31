
public class Time {

	// 설계도는 메인이 없어야 함
	
	//

	int hour = 0;
	int minute = 0;
	double second = 0;

	int getHour() {
		return hour;
	}

	void setHour(int h) {
		if (h < 0 || h > 23) {
			return;
		}

		hour = h;
	}

	int getMinute() {
		return minute;
	}

	void wetMinute(int m) {
		if (m < 0 || m > 59) {
			return;

		}
		minute = m;

	}

	double getSecond() {
		return second;
	}

	void setSecond(double s) {
		if (s < 0 || s > 59.99) {
			return;
		}
		second = s;

	}

}
