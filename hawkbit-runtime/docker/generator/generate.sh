#!/bin/bash
set -euxo pipefail
#
# Copyright (c) 2018 Bosch Software Innovations GmbH and others
#
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#

HAWKBIT_VERSION="0.3.0M7"
MARIADB_DRIVER_VERSION="2.7.2"
BASE_IMAGE="adoptopenjdk\/openjdk8:jre8u282-b08-alpine"

##################################################

mkdir -p "../$HAWKBIT_VERSION" && mkdir -p "../$HAWKBIT_VERSION-mysql"

cp ./template/KEY "../$HAWKBIT_VERSION/KEY"
cp ./template/KEY-mysql "../$HAWKBIT_VERSION-mysql/KEY"

cp ./template/Dockerfile "../$HAWKBIT_VERSION/Dockerfile"
cp ./template/Dockerfile-mysql "../$HAWKBIT_VERSION-mysql/Dockerfile"

sed -i -e "s/{{BASE_IMAGE}}/${BASE_IMAGE}/g; s/{{HAWKBIT_VERSION}}/$HAWKBIT_VERSION/g" "../$HAWKBIT_VERSION/Dockerfile"
sed -i -e "s/{{HAWKBIT_VERSION}}/$HAWKBIT_VERSION/g; s/{{MARIADB_DRIVER_VERSION}}/$MARIADB_DRIVER_VERSION/g" "../$HAWKBIT_VERSION-mysql/Dockerfile"
