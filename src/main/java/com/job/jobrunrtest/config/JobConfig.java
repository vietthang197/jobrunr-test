package com.job.jobrunrtest.config;

import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.scheduling.cron.Cron;
import org.jobrunr.spring.annotations.Recurring;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class JobConfig {

    @Recurring(id = "my-job-id", cron = "*/15 * * * * *")
    @Job(labels = "ECM", name = "Upload file to ecm")
    public void test() {
        System.out.println("===> Job is running!");
    }
}
